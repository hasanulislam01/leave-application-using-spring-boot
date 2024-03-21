package com.practice.registration.repository;

import com.practice.registration.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Integer> {
}
