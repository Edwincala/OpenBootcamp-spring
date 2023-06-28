package com.example.ejercicio04;

import com.example.ejercicio04.entities.Laptop;
import com.example.ejercicio04.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Ejercicio04Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio04Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "HP", "Omen Gaming Laptop 16z-xf000", LocalDate.of(2022, 11, 5), 1549.99f);
		Laptop laptop2 = new Laptop(null, "HP", "OMEN Laptop 17t-ck200 17.3", LocalDate.of(2022, 8, 3), 1249.99f);
		Laptop laptop3 = new Laptop(null, "msi", "Titan GT77 HX 13VI", LocalDate.of(2023, 1, 4), 5997.03f);
		Laptop laptop4 = new Laptop(null, "msi", "Raider GE78 HX 13VI", LocalDate.of(2022, 10, 25), 4210.64f);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);
		repository.save(laptop4);



	}

}
