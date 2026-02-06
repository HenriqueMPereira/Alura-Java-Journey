package io.github.henriquempereira.springexaula4;

import io.github.henriquempereira.springexaula4.model.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Springexaula4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springexaula4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Exercício 1 - Buscar maior número da lista
		List<Integer> numeros1 = Arrays.asList(10, 20, 30, 40, 50);
		Optional<Integer> maxNum = numeros1.stream().max(Integer::compareTo);
		if (maxNum.isPresent()) {
			System.out.println(maxNum);
		} else {
			System.out.println("Lista vazia!");
		}

		// Exercício 2 - Agrupar palavras pelo tamanho
		List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
		Map<Integer, List<String>> palavrasAgrupadas = palavras.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(palavrasAgrupadas);

		// Exercício 3 - Calcular soma do quadrado dos números pares
		List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		int resultado = numeros2.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList())
				.stream()
				.peek(System.out::println)
				.reduce(0, (a,b) -> a + b*b);
		System.out.println(resultado);

		// Exercício 4 - Separar ímpares de pares
		List<Integer> numeros3 = Arrays.asList(1, 2, 3, 4, 5, 6);
		Map<Boolean, List<Integer>> numSeparados = numeros3.stream()
				.collect(Collectors.groupingBy(x -> x % 2 == 0));
		System.out.println(numSeparados);

		List<Produto> produtos = Arrays.asList(
				new Produto("Smartphone", 800.0, "Eletrônicos"),
				new Produto("Notebook", 1500.0, "Eletrônicos"),
				new Produto("Teclado", 200.0, "Eletrônicos"),
				new Produto("Cadeira", 300.0, "Móveis"),
				new Produto("Monitor", 900.0, "Eletrônicos"),
				new Produto("Mesa", 700.0, "Móveis")
		);

		List<Produto> listaFiltrada = produtos.stream()
				.filter(p -> p.getPreco() < 1000)
				.filter(p -> p.getCategoria().equals("Eletrônicos"))
				.sorted(Comparator.comparingDouble(Produto::getPreco))
				.collect(Collectors.toList());
		System.out.println(listaFiltrada);

		Map<String, List<Produto>> map1 = produtos.stream()
				.collect(Collectors.groupingBy(Produto::getCategoria));
		System.out.println(map1);

		Map<String, Long> map2 = produtos.stream()
				.collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
		System.out.println(map2);

		Map<String, Optional<Produto>> map3 = produtos.stream()
				.collect(Collectors.groupingBy(Produto::getCategoria,
						Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));
		System.out.println(map3);

		Map<String, Double> map4 = produtos.stream()
				.collect(Collectors.groupingBy(Produto::getCategoria,
						Collectors.summingDouble(Produto::getPreco)));
		System.out.println(map4);
	}
}
