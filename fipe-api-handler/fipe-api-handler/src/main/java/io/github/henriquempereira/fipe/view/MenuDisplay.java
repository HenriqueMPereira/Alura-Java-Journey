package io.github.henriquempereira.fipe.view;

import io.github.henriquempereira.fipe.model.Brand;
import io.github.henriquempereira.fipe.services.FipeClient;

import java.io.IOException;

import java.util.List;
import java.util.Scanner;

public class MenuDisplay {

    private Scanner scanner = new Scanner(System.in);
    private String userChoice;

    public void startMenu(FipeClient fipeClient) {
        System.out.println("\nEste é o aplicativo de consultas de preço de carro de acordo com a FIPE.");

        do {
            System.out.println("\nDigite uma das opções abaixo");
            System.out.println("Carro: caso queira consultar carro\n" +
                    "Caminhão: caso queira consultar caminhão\n" +
                    "Moto: caso queira consultar moto\n" +
                    "Sair: caso queira sair do aplicativo de consultas");

            userChoice = scanner.nextLine();

            switch (userChoice.toUpperCase()) {
                case "CARRO":
                    System.out.println("VOCÊ ESCOLHEU CARRO!");
                    List<Brand> brandList = fipeClient.fetchDataType("carros");
                    brandList.forEach(brand -> System.out.println("Marca: " +
                                    brand.brandName() + " -> Código: " + brand.brandCode()));
                    System.out.println("Agora escolha o código da marca que você deseja:");
                    userChoice = scanner.nextLine();

                    break;
//                case "CAMINHÃO":
//                    System.out.println("VOCÊ ESCOLHEU CAMINHÃO!");
//                    break;
//                case "MOTO":
//                    System.out.println("VOCÊ ESCOLHEU MOTO!");
//                    break;
//                case "SAIR":
//                    System.out.println("VOCÊ ESCOLHEU SAIR DO APP...");
//                    break;
                default:
                    System.out.println("VOCÊ NÃO DIGITOU CORRETAMENTE...");
                    break;
            }

        } while (!userChoice.equalsIgnoreCase("SAIR"));
    }
}
