package com.kelvinmarcondes.apiunittest.services.impl;

import com.kelvinmarcondes.apiunittest.domain.User;
import com.kelvinmarcondes.apiunittest.repositories.UserRepository;
import com.kelvinmarcondes.apiunittest.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;


    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
