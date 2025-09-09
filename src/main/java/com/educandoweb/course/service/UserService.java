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
	//Operação de exclusão 
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
