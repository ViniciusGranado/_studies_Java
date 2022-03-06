package com.viniciusgranado.springcourse.repositories;

import com.viniciusgranado.springcourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
