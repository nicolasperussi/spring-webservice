package com.nicolasperussi.webservice.repositories;

import com.nicolasperussi.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
