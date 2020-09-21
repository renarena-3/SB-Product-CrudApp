package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Product;
import com.nt.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Integer saveProduct(Product product) {
		Double gst = product.getGst();
		product.setProdTotal(gst/100*product.getProdCost()+product.getProdCost());
	    Product prod = productRepository.save(product);
	    return prod.getProdId();
	}
	
	@Override
	public Optional<Product> getProdById(Integer prodId) {
		Optional<Product> product = productRepository.findById(prodId);
		return product;
	}
	
	@Override
	public List<Product> findAll() {
		
		return  productRepository.findAll();
	}

	@Override
	public Integer deleteById(Integer Id) {
		productRepository.deleteById(Id);
		return Id;
	
	}
	
	@Override
	public Optional<Product> editProductById(Integer id) {
		Optional<Product> product = productRepository.findById(id);
		return product;

	}
}
