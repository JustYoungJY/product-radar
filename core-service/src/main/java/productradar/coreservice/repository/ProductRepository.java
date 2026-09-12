package productradar.coreservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import productradar.coreservice.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
