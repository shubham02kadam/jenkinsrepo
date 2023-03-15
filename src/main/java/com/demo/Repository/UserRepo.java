package com.demo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Serializable> {

}
