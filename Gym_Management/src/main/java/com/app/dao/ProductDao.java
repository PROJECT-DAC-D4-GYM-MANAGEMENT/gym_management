package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Product;

public interface ProductDao extends JpaRepository<Product, Long> {

	Product findProductById(Long prodId);

}
