package com.kelvinmarcondes.apiunittest.services;

import com.kelvinmarcondes.apiunittest.domain.User;

public interface UserService {

    User findById(Integer id);
}
