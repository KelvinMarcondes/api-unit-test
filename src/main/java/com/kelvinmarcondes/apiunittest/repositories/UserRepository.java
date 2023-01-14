package com.kelvinmarcondes.apiunittest.repositories;


import com.kelvinmarcondes.apiunittest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {


}
