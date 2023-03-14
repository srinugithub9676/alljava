package com.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    
	@RequestMapping("/productFallback")
	public String productFallback() {
		return "product service there is a problem long time to respond please try again later";
		
	}
	@RequestMapping("/customerFallback")
	public String customerFallback() {
		return "customer service there is a problem long time to respond please try again later";
		
	}
}
