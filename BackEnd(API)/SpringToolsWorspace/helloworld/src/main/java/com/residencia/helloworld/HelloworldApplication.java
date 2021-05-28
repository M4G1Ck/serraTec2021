package com.residencia.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloName(@RequestParam(value= "var", defaultValue = "Nome nao informado") String var,
						@RequestParam(value= "idade", defaultValue= "Idade nao informada") String idade) {
		return "Nome: " + var + "\nIdade: " + idade;
	}

	@GetMapping("/hello/{nome}/{idade}")
	public String helloName(@PathVariable String nome, @PathVariable Integer idade) {
		return "Nome: " + nome + " Idade: " + idade;
	}
}
