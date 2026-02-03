package io.github.henriquempereira.exercicio1spring.util;


import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;

public class EscreveArquivo {
    ObjectMapper mapper = new ObjectMapper();
    File file = new File("tarefa.json");

    public void escreverArquivoJson(String t) {
        try {
            mapper.writeValue(file, t);
            System.out.println("JSON gravado com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
