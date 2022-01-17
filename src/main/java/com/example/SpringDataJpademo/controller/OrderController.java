package com.example.SpringDataJpademo.controller;

import org.apache.catalina.servlets.DefaultServlet.SortManager.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDataJpademo.service.OrderService;

@RestController 
public class OrderController { 
	@Autowired 
	OrderService orderService; 
	@RequestMapping(value="/createOrder") 
	public ResponseEntity<String>createOrder(@RequestBody Order order){ 
		String message=orderService.createOrder(order);
		if(message.equals("Order Created Succesfully")) {
			return new ResponseEntity<String>(message,HttpStatus.CREATED); 
		}
		else {
			return new ResponseEntity<String>(message,HttpStatus.NOT_ACCEPTABLE);
			
			
		}
	}
	

}
