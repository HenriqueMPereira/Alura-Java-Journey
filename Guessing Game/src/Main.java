import java.util.Random;
import java.util.Scanner;

/*
 * Jogo que gera um número aleatório até 100 e o usuário tenta acertar até 5 tentativas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iRandomNum, iUserNum=0, iCount;
        String sUserNum, sChoose;
        boolean bStart = true;

        while (bStart) {
            System.out.println("Um número aleatório foi gerado. Você tem 5 tentativas de acertar.");
            iRandomNum = new Random().nextInt(100);

            for (iCount = 0; iCount < 5; iCount++) {
                try {
                    System.out.println("Digite o número que você acha que é: ");
                    sUserNum = scanner.nextLine();
                    iUserNum = Integer.parseInt(sUserNum);
                } catch (NumberFormatException e) {
                    System.out.println("Erro. Isso que você digitou não é um número inteiro.");
                }

                if (iUserNum < iRandomNum) {
                    System.out.println("O valor digitado é MENOR que o randomico gerado. Tente novamente!");
                    if(iCount == 4){
                        System.out.println("Infelizmente essa foi a última tentativa...");
                    }
                } else if (iUserNum > iRandomNum) {
                    System.out.println("O valor digitado é MAIOR que o randomico gerado. Tente novamente!");
                    if(iCount == 4) {
                        System.out.println("Infelizmente essa foi a última tentativa...");
                    }
                } else {
                    System.out.println("Você ACERTOU!!! Parabéns!");
                    break;
                }
            }

            System.out.println("Você quer jogar novamente?\nSe sim, digite Y\nSe não, digite N");
            sChoose = scanner.nextLine();
            if (sChoose.equals("N")) {
                bStart = false;
            }
        }
    }
}
