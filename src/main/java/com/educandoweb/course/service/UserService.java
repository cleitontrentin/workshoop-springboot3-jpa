package com.educandoweb.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

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
	
	//operação básica de inserir no banco de dadeos
	public User insert(User obj) {
		return repository.save(obj);
		
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
}
