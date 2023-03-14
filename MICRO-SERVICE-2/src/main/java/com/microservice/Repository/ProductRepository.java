package com.microservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.Entity.Customer;

@Repository
public interface ProductRepository extends JpaRepository<Customer, Integer> {

	Customer findByCustmerName(String custmerName);

}
