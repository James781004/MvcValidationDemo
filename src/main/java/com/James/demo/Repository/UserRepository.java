package com.James.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.James.demo.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
