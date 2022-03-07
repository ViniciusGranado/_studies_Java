package com.viniciusgranado.springcourse.repositories;

import com.viniciusgranado.springcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
