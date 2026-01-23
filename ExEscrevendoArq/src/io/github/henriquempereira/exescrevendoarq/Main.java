package io.github.henriquempereira.exescrevendoarq;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.henriquempereira.exescrevendoarq.model.Title;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("arquivo.txt")){
            fileWriter.write("Conteúdo a ser gravado no arquivo.");
            System.out.println("Conteúdo gravado com sucesso!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Title titleA = new Title("Avatar", 197);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try(FileWriter fileWriter = new FileWriter("arquivo.json")) {
            fileWriter.write(gson.toJson(titleA));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}