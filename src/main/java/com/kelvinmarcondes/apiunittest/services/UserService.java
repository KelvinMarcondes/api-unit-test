package com.kelvinmarcondes.apiunittest.services;

import com.kelvinmarcondes.apiunittest.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
