package io.github.henriquempereira.screenmatch;

import com.google.gson.Gson;
import io.github.henriquempereira.screenmatch.model.Title;
import io.github.henriquempereira.screenmatch.model.TitleOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String filme = scanner.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + filme + "&apikey=e8be24d1";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        Gson gson = new Gson();
        TitleOmdb tituloOmdb = gson.fromJson(response.body(), TitleOmdb.class);
        Title titulo = new Title(tituloOmdb);
        System.out.println(titulo);

    }
}
