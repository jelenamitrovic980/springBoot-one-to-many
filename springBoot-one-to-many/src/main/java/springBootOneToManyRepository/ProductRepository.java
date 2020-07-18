package springBootOneToManyRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import springBootOneToMany.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
