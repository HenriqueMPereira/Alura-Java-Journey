package io.github.henriquempereira.screenmatch.exception;

public class LengthYearException extends RuntimeException {
    private String mensagem;
    public LengthYearException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
