package io.github.henriquempereira.screenmatch.view;

import io.github.henriquempereira.screenmatch.model.Episode;
import io.github.henriquempereira.screenmatch.model.EpisodeData;
import io.github.henriquempereira.screenmatch.model.SeasonData;
import io.github.henriquempereira.screenmatch.model.SeriesData;
import io.github.henriquempereira.screenmatch.services.ApiClient;
import io.github.henriquempereira.screenmatch.services.DataConverter;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private ApiClient apiClient = new ApiClient();

    private DataConverter dataConverter = new DataConverter();

    private final String ADRESS = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=e8be24d1";


    public void starMenu(){
        System.out.println("Digite um nome de serie:");
        String serieName = scanner.nextLine();

        String json = apiClient.fetchData(ADRESS + URLEncoder.encode(serieName, StandardCharsets.UTF_8) + API_KEY);
        SeriesData seriesData = dataConverter.convertTo(json, SeriesData.class);
        System.out.println("\n\nDados da série:\n" + seriesData + "\n\n");

        List<SeasonData> seasonDataList = new ArrayList<>();
        for(int i = 1; i <= seriesData.numberOfSeasons(); i++){
            json = apiClient.fetchData(ADRESS+ URLEncoder.encode(serieName, StandardCharsets.UTF_8) + "&season=" + i + API_KEY);
            SeasonData seasonData = dataConverter.convertTo(json, SeasonData.class);
            seasonDataList.add(seasonData);
        }
        seasonDataList.forEach(System.out::println);
        //seasonDataList.forEach(t -> t.episodes().forEach(e -> System.out.println(e.title())));

        System.out.println("\n\n***************************************************************");

        List<EpisodeData> episodesList = seasonDataList.stream()
                        .flatMap(s -> s.episodes().stream())
                                .collect(Collectors.toList());

        //System.out.println(episodesList);

        episodesList.stream()
                .filter(e -> !e.rating().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(EpisodeData::rating).reversed())
                .limit(5)
                .forEach(System.out::println);

        List<Episode> episodes = seasonDataList.stream()
                .flatMap(s -> s.episodes().stream()
                        .map(e -> new Episode(s.season(), e)))
                .collect(Collectors.toList());

        System.out.println(episodes);

    }
}
