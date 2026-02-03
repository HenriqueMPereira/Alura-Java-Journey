package io.github.henriquempereira.exercicio1spring.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    public Tarefa(@JsonProperty("descricao") String descricao,
                  @JsonProperty("concluida") Boolean concluida,
                  @JsonProperty("pessoaResponsavel") String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void concluirTarefa(){
        this.concluida = true;
    }

    @Override
    public String toString() {
        if(!this.concluida) {
            return (this.pessoaResponsavel + " está responsável por: " +
                    this.descricao);
        } else {
            return (this.pessoaResponsavel + ", responsável por " +
                    this.descricao + ", já cumpriu o dever");
        }
    }
}
