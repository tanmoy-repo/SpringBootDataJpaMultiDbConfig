package com.gitgenius;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gitgenius.model.cutomer.Customer;
import com.gitgenius.model.product.Product;
import com.gitgenius.repo.customer.CustomerRepository;
import com.gitgenius.repo.product.ProductRepository;

@RestController
public class MultiDbRestController {

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CustomerRepository customerRepo;

	@GetMapping("/products")
	public List<Product> getProducts(){
		return productRepo.findAll();
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomer(){
		return customerRepo.findAll();
	}
}
