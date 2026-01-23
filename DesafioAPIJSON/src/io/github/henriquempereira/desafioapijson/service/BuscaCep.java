package io.github.henriquempereira.desafioapijson.service;

import com.google.gson.Gson;
import io.github.henriquempereira.desafioapijson.model.EnderecoDTO;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCep {

    public EnderecoDTO buscarCep(String cep) {

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), EnderecoDTO.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter endereço a partir desse CEP!");
        }

    }
}
