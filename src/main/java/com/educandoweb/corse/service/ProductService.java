package com.educandoweb.corse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.corse.entities.Product;
import com.educandoweb.corse.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//operação para buscar todos os usuários
	public List<Product> findAll(){
		return repository.findAll();
	}
	//operação para buscar usuário pelo id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
}
