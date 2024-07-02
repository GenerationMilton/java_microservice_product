package repository;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productsRepository extends JpaRepository<Product, Integer> {
    //method to find a product by IdCategory
    List<Product> findByIdCategory(int idCategory);
}
