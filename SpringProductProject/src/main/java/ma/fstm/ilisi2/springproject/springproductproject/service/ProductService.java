package ma.fstm.ilisi2.springproject.springproductproject.service;

import ma.fstm.ilisi2.springproject.springproductproject.bo.Product;
import ma.fstm.ilisi2.springproject.springproductproject.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void delete (Long id){
        productRepository.deleteById(id);
    }

    public Optional<Product> get(Long id)
    {
       return  productRepository.findById(id);
    }





}
