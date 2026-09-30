package ie.atu.oop.week1.catservice.repository;

import ie.atu.oop.week1.catservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
