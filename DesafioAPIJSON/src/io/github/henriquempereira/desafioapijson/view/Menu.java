package io.github.henriquempereira.desafioapijson.view;

import io.github.henriquempereira.desafioapijson.model.EnderecoDTO;
import io.github.henriquempereira.desafioapijson.service.BuscaCep;
import io.github.henriquempereira.desafioapijson.service.GeradorArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public void startMenu() {

        String userChoice = "";
        Scanner scanner = new Scanner(System.in);
        BuscaCep buscaCep = new BuscaCep();

        do {
            System.out.println("Você entrou no Busca CEP!\nDigite o CEP que deseja procurar: ");
            userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("0")) {
                break;
            }
            try {
                EnderecoDTO enderecoDTO = buscaCep.buscarCep(userChoice);
                System.out.println(enderecoDTO);
                GeradorArquivo geradorArquivo = new GeradorArquivo();
                geradorArquivo.geraArqivoJson(enderecoDTO);
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }
        } while (userChoice.equalsIgnoreCase("0"));

    }
}
