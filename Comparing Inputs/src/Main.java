import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verifica se é um número positivo ou negativo
        String sInput1;
        int iInput1 = 0;
        try {
            System.out.println("Digite um número para verificar se é positivo ou negativo: ");
            sInput1 = scanner.nextLine();
            iInput1 = Integer.parseInt(sInput1);
        } catch (NumberFormatException e) {
            System.out.println("Você não digitou um número. Tente novamente");
        }

        if (iInput1 < 0) {
            System.out.println("O valor digitado é negativo");
        } else {
            System.out.println("O valor digitado é positivo");
        }

        // Compara valores inseridos pelo usuário
        String sInput2;
        int iInput2=0;
        try {
            System.out.println("Digite dois números para fazer a comparação: ");
            sInput1 = scanner.nextLine();
            iInput1 = Integer.parseInt(sInput1);
            sInput2 = scanner.nextLine();
            iInput2 = Integer.parseInt(sInput2);
        } catch (NumberFormatException e) {
            System.out.println("Você não digitou um número. Tente novamente");
        }
        if (iInput1 == iInput2) {
            System.out.println("Os valores são iguais.");
        } else if (iInput1 > iInput2) {
            System.out.println("Os valores são diferentes. O primeiro é maior");
        } else {
            System.out.println("Os valores são diferenets. O segundo é maior");
        }

        // Área de quadrado e área de círculo
        System.out.println("Se quiser calcular a área do círculo, digite C");
        System.out.println("Se quiser calcular a área do quadrado, digite Q");
        sInput1 = scanner.nextLine();
        switch (sInput1) {
            case "C":
                double dArea, dRadio;
                System.out.println("Digite o valor do raio: ");
                dRadio = scanner.nextDouble();
                dArea = Math.pow(dRadio,2) *  Math.PI;
                System.out.println("A área do círculo é: " + dArea);
                break;

            case "Q":
                double dSide;
                System.out.println("Digite o valor do lado: ");
                dSide = scanner.nextDouble();
                dArea = Math.pow(dSide,2);
                System.out.println("A área do quadrado é: " + dArea);
                break;
        }

        // Tabuada
        System.out.println("Digite um número que queira a tabuada: ");
        iInput1 = scanner.nextInt();
        System.out.println("A tabuada do "+ iInput1);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + iInput1 + " = " + i*iInput1);
        }

        // Par ou ímpar
        System.out.println("Digite um valor para verificar se é par ou ímpar: ");
        iInput1 = scanner.nextInt();
        if (iInput1 % 2 == 0) {
            System.out.println(iInput1 + " é PAR");
        } else {
            System.out.println(iInput1 + " é ÍMPAR");
        }

        // Fatorial
        System.out.println("Digite um número que queira calcular o fatorial: ");
        iInput1 = scanner.nextInt();
        iInput2 = 1;
        for (int i = iInput1; i > 0; i--) {
            iInput2 = i*iInput2;
        }
        System.out.println("O fatorial de " + iInput1 + " é: " + iInput2);
    }
}