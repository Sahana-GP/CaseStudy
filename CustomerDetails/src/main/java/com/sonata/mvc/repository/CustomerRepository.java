package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonata.mvc.model.Customers;



public class CustomerRepository extends JpaRepository<Customers, Long> {

}
