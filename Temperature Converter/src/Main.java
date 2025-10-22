import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        int fahrenheitEmInt;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos graus Celsius voce quer converter para Fahrenheit: ");
        celsius = scanner.nextFloat();
        fahrenheit = (1.8f * celsius) + 32;
        System.out.println("A temperatura " + celsius + " em Celsius foi convertirada para " +
                fahrenheit + " Fahrenheit");
        
        fahrenheitEmInt = (int)fahrenheit;
        System.out.println("A temperatura em int ficou: " + fahrenheitEmInt);
    }
}