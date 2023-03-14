package com.microservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.Entity.Customer;
import com.microservice.Service.ProductService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		Customer custmer=productService.saveCustomerDetails(customer);
		return new ResponseEntity<Customer>(custmer,HttpStatus.CREATED);	
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/findall")
	public ResponseEntity<Customer> findallCustomer(){
		List<Customer> listcustmers=productService.findallCustomerDetails();
		return new ResponseEntity(listcustmers,HttpStatus.CREATED);		
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/findName/{name}")
	public ResponseEntity<Customer> findNameCustomer(@PathVariable("name") String custmerName){
		Customer listcustmers=productService.findallCustomerNameDetails(custmerName);
		System.out.println("hello123test123dfff");
		return new ResponseEntity(listcustmers,HttpStatus.OK);		
	}
	

}
