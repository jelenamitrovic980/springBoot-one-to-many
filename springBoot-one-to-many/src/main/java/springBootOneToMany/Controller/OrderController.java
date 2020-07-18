package springBootOneToMany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springBootOneToMany.Dto.OrderRequest;
import springBootOneToMany.Entity.Customer;
import springBootOneToManyRepository.CustomerRepository;
import springBootOneToManyRepository.ProductRepository;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepository customerRespository;

	@Autowired
	private ProductRepository productRepository;

//	@PostMapping("/placeOrder")
//	public Customer placeOrder(@RequestBody OrderRequest request) {
//		return customerRespository.sava(request.getCustomer());
//
//	}
	
//	@GetMapping("/findAllOrders")
//	public List<Customer> findAllOrders() {
//		return customerRepository.findAll();
//		
//	}
//	
//	@GetMapping("/getInfo")
//	public List<Customer> getJoinInformation() {
//		return customerRepository.findAll();
//		
//	}

}