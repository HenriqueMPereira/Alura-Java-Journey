package io.github.henriquempereira.fipe;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.henriquempereira.fipe.services.FipeClient;
import io.github.henriquempereira.fipe.view.MenuDisplay;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.http.HttpClient;

@SpringBootApplication
public class FipeApiHandlerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FipeApiHandlerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HttpClient client = HttpClient.newHttpClient();
		ObjectMapper mapper = new ObjectMapper();
		FipeClient fipeClient = new FipeClient(client, mapper);
		MenuDisplay menuDisplay = new MenuDisplay();
		menuDisplay.startMenu(fipeClient);
	}
}
