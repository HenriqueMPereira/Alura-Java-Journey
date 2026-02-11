package io.github.henriquempereira.fipe.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.henriquempereira.fipe.model.Brand;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class FipeClient {

    private final HttpClient client;
    private final ObjectMapper mapper;
    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1/";

    public FipeClient(HttpClient client, ObjectMapper mapper) {
        this.client = client;
        this.mapper = mapper;
    }

    private String fetchData(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Brand> fetchDataType(String typeOfVehicle) {
        String json = fetchData(BASE_URL + typeOfVehicle + "/marcas");
        try {
            return mapper.readValue(json, new TypeReference<List<Brand>>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
