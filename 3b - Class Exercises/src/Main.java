import io.github.henriquempereira.exercicio3b.model.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Gol");
        carro1.setvalorDoCarroAno1(25000);
        carro1.setvalorDoCarroAno2(27000);
        carro1.setvalorDoCarroAno3(23000);
        carro1.calculaExibeMaior();
        carro1.calculaExibeMenor();
        carro1.setTipoDeMotor("combustão");
        carro1.mostraInformacao();
    }
}