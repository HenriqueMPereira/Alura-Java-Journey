package io.github.henriquempereira.springexaula2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class Springexaula2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springexaula2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		// Exercício 1 - Criar uma lambda para multiplicar usando Interface Funcional
		Multiplicacao operacao = (a,b) -> a*b;
		System.out.println(operacao.multiplicacao(2,5));

		// Exercício 2 - Criar uma lambda para multiplicar usando Interface Funcional
		VerificaPrimo verificacao = x -> {
			if (x <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if (x % i == 0) {
					return false;
				}
			}
			return true;
		};
		if(verificacao.verificarPrimo(13)){
			System.out.println("É primo!!!");
		} else {
			System.out.println("NÃO é primo!");
		}

		// Exercício 3 - Função Lambda que recebe uma lista e retorna todos os números multiplicados por 3
		List<Integer> listaDeInt = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		System.out.println("Lista Inicial: " + listaDeInt);
		listaDeInt.replaceAll(x -> x*3);
		System.out.println("Lista Final: " + listaDeInt);

		// Exercício 4 - Função Lambda que ordena lista de String
		List<String> listaDeString = new ArrayList<>(List.of("Paladino", "Guerreiro", "Mago"));
		System.out.println("Lista String inicial: " + listaDeString);
		//listaDeString.sort(String::compareTo);
		//Collections.sort(listaDeString);
		listaDeString.sort((a,b) -> a.compareTo(b));
		System.out.println("Lista String final:" + listaDeString);

		Divisao conta = ((a, b) -> {
			if(b == 0){
				throw new ArithmeticException();
			}
			return a/b;
		});
		try {
			System.out.println("O resultado da divisao é: " + conta.divideNumeros(10, 2));
			System.out.println("O resultado da divisão é: " + conta.divideNumeros(10, 0));
		} catch (ArithmeticException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
