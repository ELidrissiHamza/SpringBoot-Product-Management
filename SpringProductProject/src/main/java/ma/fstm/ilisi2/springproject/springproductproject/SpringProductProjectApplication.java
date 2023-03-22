package ma.fstm.ilisi2.springproject.springproductproject;

import ma.fstm.ilisi2.springproject.springproductproject.bo.Product;
import ma.fstm.ilisi2.springproject.springproductproject.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProductProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProductProjectApplication.class, args);
    }


}
