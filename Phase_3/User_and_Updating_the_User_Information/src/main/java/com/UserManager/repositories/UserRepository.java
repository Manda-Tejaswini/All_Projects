package com.UserManager.repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.UserManager.entities.User;

@Repository

public interface UserRepository extends CrudRepository<User, Integer> {

public User findByName(String name);

}
