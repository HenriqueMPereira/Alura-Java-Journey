package io.github.henriquempereira.exercicio1spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.henriquempereira.exercicio1spring.model.Tarefa;
import io.github.henriquempereira.exercicio1spring.util.EscreveArquivo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio1springApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio1springApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Exercício 1a: Iniciar um programa com Spring boot e fazer um for printando de 0 até um x
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Exercicio 1b: Criar uma classe Tarefa com construtor, getters e sobrescrever o toString
        // Exercicio 1c: instanciar um objeto Tarefa e gravar em um arquivo json
        // "Serealizar um objeto é conseguir representá-lo em um arquivo
        var tarefa1 = new Tarefa("começar os estudos de Spring Boot", false, "Henrique");
        System.out.println(tarefa1);
        tarefa1.concluirTarefa();
        System.out.println(tarefa1);
        var escreverArquivo = new EscreveArquivo();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tarefa1);
        escreverArquivo.escreverArquivoJson(json);
        System.out.println(json);

        // Exercício 1d: desserialização do json
        Tarefa tarefa2 = mapper.readValue(json, Tarefa.class);
        System.out.println(tarefa2);
    }
}
