import io.github.henriquempereira.exercicio3b.model.Carro;
import io.github.henriquempereira.exercicio3b.model.ContaCorrente;

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


        ContaCorrente cc = new ContaCorrente();
        cc.consultarSaldo();
        cc.sacar(50);
        cc.depositar(100);
        cc.sacar(25);
        cc.consultarSaldo();
        cc.cobrarTarifaMensal(25);
        cc.consultarSaldo();
    }
}