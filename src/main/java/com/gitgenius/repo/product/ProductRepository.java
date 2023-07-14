package com.gitgenius.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gitgenius.model.product.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
