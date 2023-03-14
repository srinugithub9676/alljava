package com.microservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.Entity.Customer;
import com.microservice.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Customer saveCustomerDetails(Customer customer) {
		
		return productRepository.save(customer);
	}

	public List<Customer> findallCustomerDetails() {
		List<Customer> list=productRepository.findAll();
		return list;
	}
	public Customer findallCustomerNameDetails(String custmerName) {
	Customer custname=	productRepository.findByCustmerName(custmerName);
		return custname;
	}

}
