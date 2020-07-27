package com.jelenamitrovic980.springBootonetomany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jelenamitrovic980.springBootonetomany.Dto.OrderRequest;
import com.jelenamitrovic980.springBootonetomany.Dto.OrderResponse;
import com.jelenamitrovic980.springBootonetomany.Entity.Customer;
import com.jelenamitrovic980.springBootonetomany.Repository.CustomerRepository;
import com.jelenamitrovic980.springBootonetomany.Repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());

	}

	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return customerRepository.findAll();

	}

	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInformation() {
		return customerRepository.getJoinInformation();

	}

}
