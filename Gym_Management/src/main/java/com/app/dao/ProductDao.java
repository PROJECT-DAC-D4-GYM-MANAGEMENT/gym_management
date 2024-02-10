package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.entity.Products;

public interface ProductDao extends JpaRepository<Products, Long> {

    Products findProductById(Long prodId);

}
