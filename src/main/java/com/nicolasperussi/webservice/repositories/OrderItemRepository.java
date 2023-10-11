package com.nicolasperussi.webservice.repositories;

import com.nicolasperussi.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
