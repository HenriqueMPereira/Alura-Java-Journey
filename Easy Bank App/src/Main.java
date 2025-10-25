import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bStart = true;
        int iChoice = -1;
        double dChoiceValor = 0, dTotalValor = 0;
        Scanner scanner = new Scanner(System.in);
        String sBankInfos, sBankFunctions, sScanChoice;

        sBankInfos = """
                    ***********************
                    Dados iniciais do cliente:
                    
                    Nome: Henrique Morey Pereira
                    Tipo conta: Corrente
                    Saldo inicial: R$ 0.00
                    ***********************
                    """;

        sBankFunctions = """
                    Você pode fazer as seguintes operações:
                    0 - Sair do App
                    1 - Adicionar saldo
                    2 - Transferir saldo
                    3 - Exibir saldo
                    
                    Digite a opção desejada:
                    """;

        System.out.println(sBankInfos);

        while (bStart) {
            System.out.println(sBankFunctions);
            try{
                sScanChoice = scanner.nextLine();
                iChoice = Integer.parseInt(sScanChoice);
                if (iChoice < 0 || iChoice > 3) {
                    System.out.println("Opção Inválida! Digite outro número!\n");
                } else if (iChoice == 0) {
                    System.out.println("Você escolheu fechar o App.");
                    bStart = false;
                } else if (iChoice == 1){
                    System.out.println("Você escolheu ADICIONAR saldo. Quanto de saldo deseja adicionar: ");
                    try{
                        sScanChoice = scanner.nextLine();
                        dChoiceValor = Double.parseDouble(sScanChoice);
                        if(dChoiceValor < 0){
                            System.out.println("Você digitou um valor NEGATIVO.\n");
                        }else {
                            dTotalValor += dChoiceValor;
                            System.out.println("Saldo adicionado.\n");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Você não digitou um número.\n");
                    }
                } else if (iChoice == 2) {
                    System.out.println("Você escolheu TRANSFERIR saldo. Quanto de saldo deseja transferir: ");
                    try{
                        sScanChoice = scanner.nextLine();
                        dChoiceValor = Double.parseDouble(sScanChoice);
                        if(dChoiceValor < 0){
                            System.out.println("Você digitou um valor NEGATIVO.\n");
                        }else {
                            dTotalValor -= dChoiceValor;
                            System.out.println("Saldo transferido.\n");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Você não digitou um número.\n");
                    }
                } else if (iChoice == 3){
                    System.out.println("Seu saldo é: " + dTotalValor + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção Inválida! Você não digito um número.\n");
            }
        }
    }
}