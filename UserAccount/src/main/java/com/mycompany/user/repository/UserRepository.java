package com.mycompany.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.user.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {

}