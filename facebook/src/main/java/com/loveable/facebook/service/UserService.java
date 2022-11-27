package com.loveable.facebook.service;

import com.loveable.facebook.entities.User;

public interface UserService {
    User createUser(User user);

    User findUserByUsernameAndPassword(User user);

    User findById(Long id);
}
