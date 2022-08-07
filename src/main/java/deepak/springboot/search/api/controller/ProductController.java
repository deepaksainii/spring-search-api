package deepak.springboot.search.api.controller;

import deepak.springboot.search.api.entity.Product;
import deepak.springboot.search.api.repository.ProductRepository;
import deepak.springboot.search.api.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List <Product>> searchProduct(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping("")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
