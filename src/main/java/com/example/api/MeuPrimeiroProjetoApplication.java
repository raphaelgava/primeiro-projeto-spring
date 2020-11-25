package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Anotação para preparar/inicializar o todo o spring
@SpringBootApplication

//Para rodar: Run As -> Spring Boot App
public class MeuPrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
		System.out.println("Meu primeiro projeto...");
		System.out.println("Iniciando...");
	}

}
