package io.github.henriquempereira.screenmatch.view;

import io.github.henriquempereira.screenmatch.model.Episode;
import io.github.henriquempereira.screenmatch.model.EpisodeData;
import io.github.henriquempereira.screenmatch.model.SeasonData;
import io.github.henriquempereira.screenmatch.model.SeriesData;
import io.github.henriquempereira.screenmatch.services.ApiClient;
import io.github.henriquempereira.screenmatch.services.DataConverter;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private ApiClient apiClient = new ApiClient();

    private DataConverter dataConverter = new DataConverter();

    private final String ADRESS = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=e8be24d1";


    public void starMenu() {
        System.out.println("Digite um nome de serie:");
        String serieName = scanner.nextLine();

        /*
         * Fazendo requisição dos dados da série
         */
        String json = apiClient.fetchData(ADRESS + URLEncoder.encode(serieName, StandardCharsets.UTF_8) + API_KEY);
        SeriesData seriesData = dataConverter.convertTo(json, SeriesData.class);

        /*
         * Fazendo requisição e guardando todas as temporadas em uma lista
         */
        List<SeasonData> seasonDataList = new ArrayList<>();
        for (int i = 1; i <= seriesData.numberOfSeasons(); i++) {
            json = apiClient.fetchData(ADRESS + URLEncoder.encode(serieName, StandardCharsets.UTF_8) + "&season=" + i + API_KEY);
            SeasonData seasonData = dataConverter.convertTo(json, SeasonData.class);
            seasonDataList.add(seasonData);
        }

        /*
         * Pegando a lista de temporadas e transformando em uma lista de episodios
         * "pega as caixas com bolas, tira as bolas e coloca dentro de UM saco"
         */
        List<EpisodeData> episodesList = seasonDataList.stream()
                .flatMap(s -> s.episodes().stream())
                .collect(Collectors.toList());

        /*
         * Printa os 5 piores episódios
         */
        episodesList.stream()
                .filter(e -> !e.rating().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(EpisodeData::rating))
                .limit(5)
                .forEach(System.out::println);

        /*
         * Cria uma lista da classe Episode
         */
        List<Episode> episodes = seasonDataList.stream()
                .flatMap(s -> s.episodes().stream()
                        .map(e -> new Episode(s.season(), e)))
                .collect(Collectors.toList());

        System.out.println(episodes);

        /*
         * Verificando se um episódio está na lista de Episódios.
         * - usando Stream e Optional
         */
        System.out.println("\nDigite nome (ou pedaço de nome) do episódio que deseja pesquisar: ");
        String episodeTitle = scanner.nextLine();

        Optional<Episode> searchedEpisode = episodes.stream()
                .filter(e -> e.getTitle().toUpperCase().contains(episodeTitle.toUpperCase()))
                .findFirst();

        if (searchedEpisode.isPresent()) {
            System.out.println("O episódio foi encontrado!\nTemporada: " + searchedEpisode.get().getSeason());
        } else {
            System.out.println("Episódio não encontrado...");
        }

        /*
         * Fazendo a média da nota das avaliações por temporada
         */
        Map<Integer, Double> ratingsPerSeason = episodes.stream()
                .filter(e -> e.getRating() != 0)
                .collect(Collectors.groupingBy(Episode::getSeason ,
                        Collectors.averagingDouble(Episode::getRating)));
        System.out.println("Avaliação por temporada: " + ratingsPerSeason);

        /*
         * Calculando estatísticas sobre avaliações (Rating) dos episódios
         * É aplicado um filtro para que não pegue nenhum episódio que não foi avaliado
         */
        DoubleSummaryStatistics est = episodes.stream()
                .filter(e -> e.getRating() != 0)
                .collect(Collectors.summarizingDouble(Episode::getRating));

        System.out.println(est);
    }
}
