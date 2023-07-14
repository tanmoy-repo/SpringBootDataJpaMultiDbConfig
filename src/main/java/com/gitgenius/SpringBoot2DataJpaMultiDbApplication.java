package com.gitgenius;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gitgenius.model.cutomer.Customer;
import com.gitgenius.model.product.Product;
import com.gitgenius.repo.customer.CustomerRepository;
import com.gitgenius.repo.product.ProductRepository;

@SpringBootApplication
public class SpringBoot2DataJpaMultiDbApplication implements CommandLineRunner {
	
	
	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CustomerRepository customerRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2DataJpaMultiDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.saveAll(
				Arrays.asList(
						new Product(101, "P-1", "PEN"),
						new Product(102, "P-2", "BOOK"),
						new Product(103, "P-3", "TEST")
						)
				);

		customerRepo.saveAll(
				Arrays.asList(
						new Customer(550, "sam@gmail.com", "sam"),
						new Customer(551, "ram@gmail.com", "ram"),
						new Customer(552, "khan@gmail.com", "khan")
						)
				);
		
	}

}
