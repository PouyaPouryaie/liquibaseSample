package ir.bigZ.liquibaseApp.product.resource;

import ir.bigZ.liquibaseApp.product.model.Product;
import ir.bigZ.liquibaseApp.product.repository.ProductRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
public class ProductResource {

    private final ProductRepo productRepo;

    public ProductResource(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @PostMapping
    public ResponseEntity<?> insertProduct(@RequestBody Product product){
        Product save = productRepo.save(product);
        return ResponseEntity.ok(save);
    }
}
