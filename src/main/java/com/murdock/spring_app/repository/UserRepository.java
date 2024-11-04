package com.murdock.spring_app.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murdock.spring_app.database.models.User;

public interface UserRepository extends JpaRepository<User, UUID>{
}
