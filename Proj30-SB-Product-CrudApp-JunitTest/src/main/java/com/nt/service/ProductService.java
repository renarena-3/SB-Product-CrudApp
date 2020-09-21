package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.model.Product;

public interface ProductService {

	public Integer saveProduct(Product product);
	
	public Optional<Product> getProdById(Integer prodId);
	
	public List<Product> findAll();
	
	public Integer deleteById(Integer Id);
	
	public Optional<Product> editProductById(Integer id);
	
	
}
