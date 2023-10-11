package com.nicolasperussi.webservice.repositories;

import com.nicolasperussi.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
