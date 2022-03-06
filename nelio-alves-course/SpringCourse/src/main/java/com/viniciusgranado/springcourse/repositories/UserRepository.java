package com.viniciusgranado.springcourse.repositories;

import com.viniciusgranado.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
