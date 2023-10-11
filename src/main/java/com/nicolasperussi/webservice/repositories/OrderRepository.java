package com.nicolasperussi.webservice.repositories;

import com.nicolasperussi.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
