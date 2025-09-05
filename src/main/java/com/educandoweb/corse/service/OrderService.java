package com.educandoweb.corse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.corse.entities.Order;
import com.educandoweb.corse.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	//operação para buscar todos os usuários
	public List<Order> findAll(){
		return repository.findAll();
	}
	//operação para buscar usuário pelo id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}
}
