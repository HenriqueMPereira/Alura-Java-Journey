package io.github.henriquempereira.exercicio3b.model;

public class Carro extends Veiculo{
    private String tipoDeMotor;

    @Override
    public void mostraInformacao() {
        super.mostraInformacao();
        System.out.println("O tipo de motor é: " + this.tipoDeMotor);
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }
}
