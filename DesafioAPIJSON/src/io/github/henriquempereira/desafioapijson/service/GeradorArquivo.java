package io.github.henriquempereira.desafioapijson.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.henriquempereira.desafioapijson.model.EnderecoDTO;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {

    public void geraArqivoJson(EnderecoDTO endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter fileWriter = new FileWriter(endereco.cep() + ".json");
        fileWriter.write(gson.toJson(endereco));
        fileWriter.close();
    }

}
