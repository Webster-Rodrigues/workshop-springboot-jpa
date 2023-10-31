package com.webJava.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webJava.course.entities.User;
import com.webJava.course.repositories.UserRepository;

//Classe de Configuração
@Configuration
@Profile("test")//a classe vai ser uma config específica para o perfil de test
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		//Tudo que colocar dentro desse método vai ser exec quando a aplicação for iniciada 
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//pra salvar precisa chamar o Repository já que ele acessa o bd
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
