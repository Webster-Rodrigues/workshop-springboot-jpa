package com.webJava.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webJava.course.entities.User;
import com.webJava.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired // faz injeção de dependência
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}

//RestController - sinaliza um recurso web implementado por um controlador rest
//ResponseEntity - tipo específico do sb que retorna resposta de requisições web