package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ProductNotFoundException;
import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
    private ProductRepository repo;

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id " + id));
    }

    public Product updateProduct(Long id, Product updated) {
        Product existing = getProductById(id);
        existing.setPname(updated.getPname());
        existing.setPrice(updated.getPrice());
        existing.setReview(updated.getReview());
        return repo.save(existing);
    }

    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        repo.delete(product);
    }

}
