package com.example.KeVeo.data.repository;

import com.example.KeVeo.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RegisterUserRepository extends JpaRepository <User, Integer> {

  // User findByUserNameAndActiveTrue(String username);


}
