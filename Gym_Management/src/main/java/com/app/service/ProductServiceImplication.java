package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ProductDao;
import com.app.dto.ProductDTO;
import com.app.entity.Product;

@Transactional
@Service
public class ProductServiceImplication implements ProductService{
	
	@Autowired
	ProductDao prodDao;
	@Autowired
    private ModelMapper mapper;

	@Override
	public String addProduct(ProductDTO prod) {
		System.out.println(prod);
		prodDao.save(mapper.map(prod, Product.class));
		return "succesful";
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		
		return prodDao.findAll().stream().map(p->mapper.map(p, ProductDTO.class)).collect(Collectors.toList());
	}

	@Override
	public ProductDTO getprodDetailsById(Long prodId) {
		Product p = prodDao.findProductById(prodId);
		return mapper.map(p, ProductDTO.class);
	}

}
