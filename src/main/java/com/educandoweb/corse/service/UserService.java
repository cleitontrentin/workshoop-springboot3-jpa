package com.educandoweb.corse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.corse.entities.User;
import com.educandoweb.corse.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	//operação para buscar todos os usuários
	public List<User> findAll(){
		return repository.findAll();
	}
	//operação para buscar usuário pelo id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
}
