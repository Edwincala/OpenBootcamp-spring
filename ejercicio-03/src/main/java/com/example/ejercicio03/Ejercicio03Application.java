package com.example.ejercicio03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio03Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio03Application.class, args);
		PokemonRepository repository = context.getBean(PokemonRepository.class);
		System.out.println("Hay " + repository.count() + " pokemones en la base de datos");

		Pokemon bulbasaur = new Pokemon(null, "Bulbasaur", 0.7f, 6.9f, "Semilla", "Espesura");
		Pokemon charmander = new Pokemon(null, "Charmander", 0.6f, 8.5f, "Lagartija", "Mar Llamas");
		Pokemon squirtle = new Pokemon(null, "Squirtle", 0.5f, 9f, "Tortuguita", "Torrente");

		repository.save(bulbasaur);
		repository.save(charmander);
		repository.save(squirtle);

		System.out.println("Hay " + repository.count() + " pokemones en la base de datos");
		System.out.println(repository.findAll());

		System.out.println(repository.findById(2));
	}

}
