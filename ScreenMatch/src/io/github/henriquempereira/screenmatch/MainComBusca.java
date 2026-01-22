package io.github.henriquempereira.screenmatch;

import com.google.gson.Gson;
import io.github.henriquempereira.screenmatch.exception.LengthYearException;
import io.github.henriquempereira.screenmatch.model.Title;
import io.github.henriquempereira.screenmatch.model.TitleOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        List<Title> listaDeTitulos = new ArrayList<>();
        Gson gson = new Gson();

        String opcao = "";

        while(!opcao.equalsIgnoreCase("sair")) {

            System.out.println("Digite o nome do filme que deseja procurar: ");
            opcao = scanner.nextLine();
            if(opcao.equalsIgnoreCase("sair")){
                break;
            }

            try {
                String encodedOpcao = URLEncoder.encode(opcao, StandardCharsets.UTF_8);
                String endereco = "http://www.omdbapi.com/?t=" + encodedOpcao + "&apikey=e8be24d1";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                listaDeTitulos.add(new Title(gson.fromJson(response.body(), TitleOmdb.class)));
                System.out.println(listaDeTitulos);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro:");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("O nome digitado está incorreto!");
                System.out.println(e.getMessage());
            } catch (LengthYearException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
