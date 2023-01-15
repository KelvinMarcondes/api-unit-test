package com.kelvinmarcondes.apiunittest.services;

import com.kelvinmarcondes.apiunittest.domain.User;
import com.kelvinmarcondes.apiunittest.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create (UserDTO obj);
}
