package net.safedata.spring.data.rest;

import net.safedata.spring.data.rest.repository.ProductRepository;
import net.safedata.spring.training.jpa.model.Product;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.IntStream;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "net.safedata.spring.data.rest.repository")
@EntityScan(basePackages = "net.safedata.spring.training.jpa.model")
public class SpringDataRESTDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRESTDemoApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(final ProductRepository productRepository) {
        return args -> IntStream.range(0, 10)
                                .forEach(id -> productRepository.save(new Product("The product #" + id, id * 50)));
    }
}
