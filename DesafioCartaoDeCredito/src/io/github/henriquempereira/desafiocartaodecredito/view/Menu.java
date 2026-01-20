package io.github.henriquempereira.desafiocartaodecredito.view;

import io.github.henriquempereira.desafiocartaodecredito.model.CreditCard;
import io.github.henriquempereira.desafiocartaodecredito.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    // Responsável pela apresentação das opções e rodar o app.
    public void startApp() {

        Scanner scanner = new Scanner(System.in);
        Integer option;
        String userChoice;

        System.out.println("Este é o aplicativo do Banco Morey.");
        System.out.println("Digite o nome do usuário do cartão: ");
        String userName = scanner.nextLine();
        CreditCard creditCard = new CreditCard(userName);

        do {
            System.out.println("Digite as opções abaixo:");
            System.out.println("0 - Sair\n" +
                    "1 - Adicionar compra\n" +
                    "2 - Mostrar informações da conta\n" +
                    "3 - Mostrar lista de compras\n" +
                    "4 - Definir crédito");
            userChoice = scanner.nextLine();
            try {
                option = Integer.parseInt(userChoice);

                switch (option) {
                    case 1: // Adiciona compra do produto no cartão
                            System.out.println("Digite o nome do produto: ");
                            String productName = scanner.nextLine();
                            System.out.println("Digite o preço do produto: ");
                            String price = scanner.nextLine();
                            try {
                                double productPrice = Double.parseDouble(price);
                                if (productPrice >= 0) {
                                    try{
                                        Product productAux = new Product(productName, productPrice);
                                        creditCard.addProduct(productAux);
                                    } catch (IllegalArgumentException e){
                                        System.out.println(e.getMessage());
                                    }
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Você não digitou um número!");
                            }
                        break;
                    case 2: // Mostra nome do titular, crédito total e usado
                        System.out.println("Informações do seu cartão:");
                        creditCard.showInformations();
                        break;
                    case 3: // Mostrar produtos na lista em ordem (do mais barato para o mais caro)
                        System.out.println("Lista de compras:");
                        creditCard.showProductsInTheList();
                        break;
                    case 4: // Definindo valor de crédito usável
                        System.out.println("Você escolheu definir seu crédito. Digite o valor: ");
                        String creditAux = scanner.nextLine();
                        try {
                            Double credit = Double.parseDouble(creditAux);
                            System.out.println("Tem certeza disso? Digite y/n: ");
                            String confirm = scanner.nextLine();
                            if(confirm.equals("y")) {
                                try {
                                    creditCard.setMaxCredit(credit);
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Valor digitado incorreto!");
                        }
                        break;
                    case 0:
                        System.out.println("Saindo do App...");
                        break;
                    default:
                        System.out.println("Opção inválida!!!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("O valor digitado não é um número inteiro");
                option = -1;
            }
        } while (option != 0);
    }
}
