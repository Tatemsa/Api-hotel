package com.api.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.hotel.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
