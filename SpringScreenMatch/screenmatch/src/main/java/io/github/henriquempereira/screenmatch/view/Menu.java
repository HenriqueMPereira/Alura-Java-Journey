package io.github.henriquempereira.screenmatch.view;

import io.github.henriquempereira.screenmatch.model.SeasonData;
import io.github.henriquempereira.screenmatch.model.SeriesData;
import io.github.henriquempereira.screenmatch.services.ApiClient;
import io.github.henriquempereira.screenmatch.services.DataConverter;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println(json);
        SeriesData seriesData = dataConverter.convertTo(json, SeriesData.class);
        System.out.println(seriesData);

        List<SeasonData> seasonDataList = new ArrayList<>();
        for(int i = 1; i <= seriesData.numberOfSeasons(); i++){
            json = apiClient.fetchData(ADRESS+ URLEncoder.encode(serieName, StandardCharsets.UTF_8) + "&season=" + i + API_KEY);
            SeasonData seasonData = dataConverter.convertTo(json, SeasonData.class);
            seasonDataList.add(seasonData);
        }
        seasonDataList.forEach(System.out::println);

        seasonDataList.forEach(t -> t.episodes().forEach(e -> System.out.println(e.title())));
    }
}
