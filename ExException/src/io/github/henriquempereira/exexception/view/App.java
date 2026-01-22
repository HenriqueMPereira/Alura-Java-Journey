package io.github.henriquempereira.exexception.view;

import io.github.henriquempereira.exexception.exception.InvalidPasswordException;
import io.github.henriquempereira.exexception.model.DivisionOfNumbers;
import io.github.henriquempereira.exexception.model.Password;

import java.util.Scanner;

public class App {
    public void startApp(){
        String opcaoDoUsuario = "";
        Scanner scanner = new Scanner(System.in);
        String userInput;
        Double numerator;
        Double denominator;

        do{
            System.out.println("********** Abaixo estão as opções do App **********\n");
            System.out.println("Sair: se desejar sair;\nDividir: se desejar dividir dois números."+
                    "\nSenha: se quiser verificar se uma senha é forte suficiente");
            System.out.println("\nDigite qual opção você deseja: ");
            opcaoDoUsuario = scanner.nextLine();

            switch (opcaoDoUsuario){
                case "dividir":
                    try{
                        System.out.println("Você escolheu a divisão de números!\nDigite o NUMERADOR:");
                        userInput = scanner.nextLine();
                        numerator = Double.parseDouble(userInput);
                        System.out.println("Você escolheu a divisão de números!\nDigite o DENOMINADOR:");
                        userInput = scanner.nextLine();
                        denominator = Double.parseDouble(userInput);
                        DivisionOfNumbers divisionOfNumbers = new DivisionOfNumbers(numerator, denominator);
                        System.out.println("O valor da divisão " + numerator + " por " + denominator +
                                " é: " + divisionOfNumbers.calculate());
                    } catch (NumberFormatException e) {
                        System.out.println("Você não digitou um valor válido!!!");
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "senha":
                    try{
                        System.out.println("Você escolheu testar a força de uma senha!\nDigite a senha:");
                        userInput = scanner.nextLine();
                        Password password = new Password(userInput);
                        password.verifyPassword();
                        System.out.println("A senha " + password.toString() + " é válida!!!");
                    } catch (InvalidPasswordException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "sair":
                    System.out.println("Você escolheu sair do App...");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!!!");
                    break;
            }
        }while(!opcaoDoUsuario.equalsIgnoreCase("sair"));
    }
}
