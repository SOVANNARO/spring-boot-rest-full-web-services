package org.tutorials.springbootrestfullwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tutorials.springbootrestfullwebservices.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
