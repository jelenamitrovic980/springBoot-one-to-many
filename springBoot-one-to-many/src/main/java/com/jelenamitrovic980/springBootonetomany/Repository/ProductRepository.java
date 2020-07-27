package com.jelenamitrovic980.springBootonetomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jelenamitrovic980.springBootonetomany.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
