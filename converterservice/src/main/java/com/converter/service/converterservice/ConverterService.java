package com.converter.service.converterservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterService {

	@GetMapping("/conversions/ktoc/{num}")
	public double ktoc(@PathVariable double num) {
		double result=1;
	    result=num+273.15;
	    return result;
	}
	
	@GetMapping("/conversions/ctok/{num}")
	public double ctok(@PathVariable double num) {
		double result=1;
	    result=num-273.15;
	    return result;
	}
	
	@GetMapping("/conversions/mtok/{num}")
	public double mtok(@PathVariable double num) {
		double result=1;
	    result=num*1.609;
	    return result;
	}
	
	@GetMapping("/conversions/ktom/{num}")
	public double ktom(@PathVariable double num) {
		double result=1;
	    result=num/1.609;
	    return result;
	}
}
