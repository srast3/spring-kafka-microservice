package com.mycompany.user.service;

import com.mycompany.user.entity.User;

public interface UserService {

    User registerUser(User input);

    Iterable<User> findAll();
}
