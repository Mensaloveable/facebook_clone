package com.loveable.facebook.implementation;

import com.loveable.facebook.entities.User;
import com.loveable.facebook.repository.UserRepository;
import com.loveable.facebook.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User findUserByUsernameAndPassword(User user) {

        Optional<User>  foundUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());

        if(foundUser.isEmpty()){
            return null;
        }

        return foundUser.get();
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new IllegalStateException("User Not Found");
        }

        return user.get();
    }
}
