package com.thilagalabs.orderservice.repositories;

import com.thilagalabs.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}