package io.github.henriquempereira.screenmatch;

import io.github.henriquempereira.screenmatch.model.EpisodeData;
import io.github.henriquempereira.screenmatch.model.SeriesData;
import io.github.henriquempereira.screenmatch.services.ApiClient;
import io.github.henriquempereira.screenmatch.services.DataConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var apiClient = new ApiClient();
		String url = "http://www.omdbapi.com/?t=breaking+bad&apikey=e8be24d1";
		String json = apiClient.fetchData(url);

		//System.out.println(json);
		DataConverter dataConverter = new DataConverter();
		SeriesData seriesData = dataConverter.convertTo(json,SeriesData.class);
		System.out.println(seriesData);

		url = "https://www.omdbapi.com/?t=breaking+bad&season=1&episode=1&apikey=e8be24d1";
		json = apiClient.fetchData(url);
		EpisodeData episodeData = dataConverter.convertTo(json, EpisodeData.class);
		System.out.println(episodeData);
	}
}
