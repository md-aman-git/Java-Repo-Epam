package com.epam.products.service;

import java.util.List;

import com.epam.products.restcontroller.ProductVO;

public interface ProductService {
	public List<ProductVO> findAllProducts();
	public void savePart(ProductVO productVO);
	public ProductVO findById(int id);
	public void deleteProductById(int id);
	public void updateProduct(ProductVO productVO);
}
