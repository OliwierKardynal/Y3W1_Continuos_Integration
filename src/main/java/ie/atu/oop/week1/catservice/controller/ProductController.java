package ie.atu.oop.week1.catservice.controller;

import ie.atu.oop.week1.catservice.model.Product;
import ie.atu.oop.week1.catservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
private final ProductService productService;

public ProductController(ProductService productService) {
    this.productService = productService;
}
@GetMapping
public List<Product> getAll() {
    return productService.getAll();
    }

    @PostMapping
public Product create(@RequestBody Product product) {
    return productService.create(product);
}
}
