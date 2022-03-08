package com.viniciusgranado.springcourse.repositories;

import com.viniciusgranado.springcourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
