
package com.app.service;

import java.util.List;

import com.app.dto.ProductDTO;

public interface ProductService {

	Object addProduct(ProductDTO prod);

	List<ProductDTO> getAllProducts();

	ProductDTO getprodDetailsById(Long prodId);

}
