//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double valorA=2, valorB = 3, media=(valorA+valorB)/2;

        System.out.println("A media de A e B é: "+ media);

        int castDoubleToInt = (int)media;
        System.out.println("A média era " + media + " e ficou "+ castDoubleToInt + " após o casting");

        char c = 'H'; // Para char devemos usar aspas simples
        String name = "A inicial do nome Henrique é ";
        String phrase = name + c;
        System.out.println(phrase);

        double priceOfCandy = 1.69;
        int numberOfCandy = 100;
        System.out.println("O valor total dos doces é: " + priceOfCandy*numberOfCandy);

        double valorEmDolares = 11, valorEmReais = 4.94 * valorEmDolares;
        System.out.println("O valor em reais é: " + valorEmReais);

        double precoOriginal = 8, percentualDesconto = 10, valorDescontado;
        valorDescontado = (precoOriginal*(100-percentualDesconto))/100;
        System.out.println("O valor final já com o desconto é: " + valorDescontado);
    }
}