package com.educandoweb.corse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.corse.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Cleiton", "cleiton@gmail.com", "999999999", "123");
		return ResponseEntity.ok().body(u);
	}
	
}
