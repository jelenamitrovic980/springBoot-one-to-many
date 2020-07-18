package springBootOneToManyRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import springBootOneToMany.Dto.OrderResponse;
import springBootOneToMany.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query("SELECT new springBootOneToManyDto.OrderResponse(c.name, p.productName) FROm Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();

}
