package io.github.henriquempereira.desafiocartaodecredito.view;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Menu {

    // Responsável pela apresentação das opções e rodar o app.
    public void startApp() {
        Scanner scanner = new Scanner(System.in);
        Integer option;
        String userChoice;
        System.out.println("Este é o aplicativo do Banco Morey.");

        do {
            System.out.println("Digite as opções abaixo:");
            System.out.println("0 - Sair\n1 - Adicionar compra\n2 - Mostrar crédito\n3 - Mostrar lista de compras");
            userChoice = scanner.nextLine();
            try {
                option = Integer.parseInt(userChoice);

                switch (option) {
                    case 1:
                        System.out.println("Produto adicionado!");
                        break;
                    case 2:
                        System.out.println("Suas informações!");
                        break;
                    case 3:
                        System.out.println("Lista de compras!");
                        break;
                    case 0:
                        System.out.println("Saindo do App...");
                        break;
                    default:
                        System.out.println("Opção inválida!!!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("O valor digitado não é um inteiro");
                option = -1;
            }
        } while (option != 0);
    }
}
