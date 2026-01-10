import io.github.henriquempereira.interfaces.model.*;
import io.github.henriquempereira.interfaces.service.ConversorTemperatura;

public class Main {
    public static void main(String[] args) {

        // Exercício 1 - Convertendo Moeda
        ConversorMoeda realPraDolar = new ConversorMoeda();
        realPraDolar.setdQuantidadeReal(10.1);
        System.out.println("O valor final é: " + realPraDolar.converterDolarParaReal());

        // Exercício 2 - Calculando área e perímetro
        CalculadoraSalaRetangular salaRetangular = new CalculadoraSalaRetangular();
        salaRetangular.setDLadoMaior(10.5);
        salaRetangular.setDLadoMenor(1.5);
        System.out.println("A área é: " + salaRetangular.calcularArea());
        System.out.println("O perímetro é: " + salaRetangular.calcularPerimetro());

        // Exercício 3 - Tabuada
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.setiNumero(7);
        tabuada.mostrarTabuada();

        // Exercício 4 - Converter temperatura
        ConversorTemperaturaPadrao converterTemperatura = new ConversorTemperaturaPadrao();
        converterTemperatura.setdTemperaturaCelsius(0);
        converterTemperatura.setdTemperaturaFahrenheit(41);
        System.out.println(converterTemperatura.getdTemperaturaCelsius() + " em Fahrenheit é: " + converterTemperatura.celsiusParaFahrenheit());
        System.out.println(converterTemperatura.getdTemperaturaFahrenheit() + " em Celsius é: " + converterTemperatura.fahrenheitParaCelsius());

        // Exercício 5 - Preço dos produtos
        Livro livro = new Livro();
        livro.setPrecoLivro(10);
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPrecoProdutoFisico(10);
        System.out.println("O valor do livro é: " + livro.calcularPrecoFinal());
        System.out.println("O valor do produtor físico é: " + produtoFisico.calcularPrecoFinal());
    }
}