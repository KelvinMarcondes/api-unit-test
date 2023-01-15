package com.kelvinmarcondes.apiunittest.services.impl;

import com.kelvinmarcondes.apiunittest.domain.User;
import com.kelvinmarcondes.apiunittest.repositories.UserRepository;
import com.kelvinmarcondes.apiunittest.services.UserService;
import com.kelvinmarcondes.apiunittest.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<User> findAll(){
        return repository.findAll();
    }
}
