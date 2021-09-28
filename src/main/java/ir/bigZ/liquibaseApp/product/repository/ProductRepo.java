package ir.bigZ.liquibaseApp.product.repository;

import ir.bigZ.liquibaseApp.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
