package io.github.henriquempereira.springexaula3;

import io.github.henriquempereira.springexaula3.model.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Springexaula3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springexaula3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		numeros1.stream()
				.filter(n -> n % 2 == 0)
				.forEach(System.out::println);

		List<String> palavras1 = Arrays.asList("java", "stream", "lambda");
		palavras1.stream()
				.map(p -> p.toUpperCase())
				.forEach(System.out::println);

		List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> novaLista = numeros2.stream()
				.filter(n -> n % 2 != 0)
				.map(n -> n * 2)
				.collect(Collectors.toList());
		System.out.println(novaLista);

		List<String> palavras2 = Arrays.asList("apple", "banana", "apple", "orange", "banana");
		palavras2.stream()
				.distinct()
				.forEach(System.out::println);

		List<List<Integer>> listaDeNumeros = Arrays.asList(
				Arrays.asList(1, 2, 3, 4),
				Arrays.asList(5, 6, 7, 8),
				Arrays.asList(9, 10, 11, 12)
		);

		List<Produto> produtos = Arrays.asList(
				new Produto("Smartphone", 800.0, "Eletrônicos"),
				new Produto("Notebook", 1500.0, "Eletrônicos"),
				new Produto("Teclado", 200.0, "Eletrônicos"),
				new Produto("Cadeira", 300.0, "Móveis"),
				new Produto("Monitor", 900.0, "Eletrônicos"),
				new Produto("Mesa", 700.0, "Móveis")
		);

		List<Produto> listaDeProdMenorMil = produtos.stream()
				.filter(p-> p.getCategoria().equals("Eletrônicos"))
				.filter(prod -> prod.getPreco() < 1000)
				.sorted((prod1, prod2) -> Double.compare(prod1.getPreco(),prod2.getPreco()))
				.limit(3)
				.collect(Collectors.toList());

		listaDeProdMenorMil.forEach(System.out::println);
	}
}
