package deepak.springboot.search.api.service;

import deepak.springboot.search.api.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
