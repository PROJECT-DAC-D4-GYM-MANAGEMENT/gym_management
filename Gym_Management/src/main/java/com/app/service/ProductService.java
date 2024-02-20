
package com.app.service;

import java.util.List;

import com.app.dto.AddProductDTO;
import com.app.dto.ProductDTO;
import com.app.entity.Products;

public interface ProductService {

	//Object addProduct(ProductDTO prod);

	List<ProductDTO> getAllProducts();

	ProductDTO getprodDetailsById(Long prodId);

	Object addProduct(AddProductDTO prod);
	
	List<Products> getProductsPage(Integer num);

}
