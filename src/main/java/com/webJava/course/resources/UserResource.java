package com.webJava.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webJava.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "119542851", "123456");
		return ResponseEntity.ok().body(u);
	}

}

//RestController - sinaliza um recurso web implementado por um controlador rest
//ResponseEntity - tipo específico do sb que retorna resposta de requisições web