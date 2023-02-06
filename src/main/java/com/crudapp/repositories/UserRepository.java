package com.crudapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
