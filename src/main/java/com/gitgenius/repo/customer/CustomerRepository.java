package com.gitgenius.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gitgenius.model.cutomer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
