package com.epam.products.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.products.entity.Product;
import com.epam.products.repo.ProductRepo;
import com.epam.products.restcontroller.ProductVO;
import com.epam.products.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	@Override
	public List<ProductVO> findAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = productRepo.findAll();
		List<ProductVO> productsVO = new ArrayList<>();
		for(Product product : products) {
			ProductVO prodVO = new ProductVO();
			prodVO.setId(product.getId());
			prodVO.setName(product.getName());
			prodVO.setBrand(product.getBrand());
			prodVO.setModel(product.getModel());
			prodVO.setType(product.getType());
			prodVO.setPrice(product.getPrice());
			productsVO.add(prodVO);
		}
		return productsVO;
	}
	@Override
	public void savePart(ProductVO productVO) {
		// TODO Auto-generated method stub
		Product prod = new Product();
		prod.setName(productVO.getName());
		prod.setBrand(productVO.getBrand());
		prod.setModel(productVO.getModel());
		prod.setType(productVO.getType());
		prod.setPrice(productVO.getPrice());
		productRepo.save(prod);
	}
	@Override
	public ProductVO findById(int id) {
		// TODO Auto-generated method stub
		Product product = productRepo.findById(id);
		ProductVO prodVO = new ProductVO();
		prodVO.setId(product.getId());
		prodVO.setName(product.getName());
		prodVO.setBrand(product.getBrand());
		prodVO.setModel(product.getModel());
		prodVO.setType(product.getType());
		prodVO.setPrice(product.getPrice());
		return prodVO;
	}
	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
	}
	@Override
	public void updateProduct(ProductVO productVO) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(productVO.getId());
		product.setBrand(productVO.getBrand());
		product.setName(productVO.getName());
		product.setModel(productVO.getModel());
		product.setType(productVO.getType());
		product.setPrice(productVO.getPrice());
		productRepo.save(product);
	}

}
