package com.epam.products.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epam.products.service.ProductService;

@RestController
public class ProductsController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductVO>> getProducts() {
		System.out.println("Hello products");
		List<ProductVO> productsVO = productService.findAllProducts();
		return new ResponseEntity<>(productsVO, HttpStatus.OK);
	}
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductVO> getProducts(@PathVariable int id) {
		System.out.println("Hello product with id : " + id);
		ProductVO productVO = productService.findById(id);
		return new ResponseEntity<>(productVO, HttpStatus.OK);
	}
	@PostMapping("/products")
	public ResponseEntity<String> savePart(@RequestBody ProductVO productVO) {
		productService.savePart(productVO);
		return new ResponseEntity<>("Saved Product!", HttpStatus.CREATED);
	}
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id) {
		productService.deleteProductById(id);
		System.out.println("Delete ID : " + id);
		return new ResponseEntity<>("Deleted : " + id, HttpStatus.OK);
	}
	@PutMapping("/products")
	public ResponseEntity<String> updatePart(@RequestBody ProductVO productVO) {
		productService.updateProduct(productVO);
		return new ResponseEntity<>("Updated : " + productVO.getId(), HttpStatus.OK);
	}
}
