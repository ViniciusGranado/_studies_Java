package com.viniciusgranado.springcourse.repositories;

import com.viniciusgranado.springcourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
