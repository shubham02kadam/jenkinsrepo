package com.demo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Serializable> {

}
