package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Product;

public interface ProductService {
	
	Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);

}
