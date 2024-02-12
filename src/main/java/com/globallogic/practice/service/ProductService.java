package com.globallogic.practice.service;

import java.util.List;

import com.globallogic.practice.exception.IdNotFoundException;
import com.globallogic.practice.repo.ProductRepository;
import com.globallogic.practice.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.practice.entity.Product;

@Service
public class ProductService {
//
//	public Product addProduct(Product product);
//	public List<Product> getAllProducts();
//	public Product getProductById(int id);
//	public Product updateProductById(int id,Product product);
//	public String deleteProductById(int id);

	@Autowired
	ProductRepository productRepository;

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int id) {

		return productRepository.findById(id).orElseThrow(()->new IdNotFoundException(AppConstants.PRODUCT_ID_NOT_MESSAGE));
	}

	public Product updateProductById(int id, Product product) {
		Product prod=	productRepository.findById(id).orElseThrow(()->new IdNotFoundException(AppConstants.PRODUCT_ID_NOT_MESSAGE));
		productRepository.save(prod);
		return product;
	}

	public String deleteProductById(int id) {
		Product prod=productRepository.findById(id).orElseThrow(()-> new IdNotFoundException(AppConstants.PRODUCT_ID_NOT_MESSAGE));
		productRepository.delete(prod);
		return AppConstants.APT_DELETE_SUCCESS_MESSAGE;
	}
}
