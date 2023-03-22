package ma.fstm.ilisi2.springproject.springproductproject.dao;

import ma.fstm.ilisi2.springproject.springproductproject.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
