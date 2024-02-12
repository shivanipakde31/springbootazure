//package com.globallogic.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.globallogic.entity.Product;
//import com.globallogic.exception.IdNotFoundException;
//import com.globallogic.repo.ProductRepository;
//import com.globallogic.util.AppConstants;
//
//@Service
//public class ProductServiceImpl implements ProductService{
//
//	@Autowired
//	ProductRepository productRepository;
//
//	@Override
//	public Product addProduct(Product product) {
//		return productRepository.save(product);
//	}
//
//	@Override
//	public List<Product> getAllProducts() {
//		return productRepository.findAll();
//	}
//
//	@Override
//	public Product getProductById(int id) {
//
//		return productRepository.findById(id).orElseThrow(()->new IdNotFoundException(AppConstants.PRODUCT_ID_NOT_MESSAGE));
//	}
//
//	@Override
//	public Product updateProductById(int id, Product product) {
//		Product prod=	productRepository.findById(id).orElseThrow(()->new IdNotFoundException(AppConstants.PRODUCT_ID_NOT_MESSAGE));
//		productRepository.save(prod);
//		return product;
//	}
//
//	@Override
//	public String deleteProductById(int id) {
//		Product prod=productRepository.findById(id).orElseThrow(()-> new IdNotFoundException(AppConstants.PRODUCT_ID_NOT_MESSAGE));
//		productRepository.delete(prod);
//		return AppConstants.APT_DELETE_SUCCESS_MESSAGE;
//	}
//
//}
