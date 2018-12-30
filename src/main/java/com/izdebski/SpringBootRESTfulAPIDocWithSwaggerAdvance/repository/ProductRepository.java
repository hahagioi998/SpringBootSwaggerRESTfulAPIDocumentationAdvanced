package com.izdebski.SpringBootRESTfulAPIDocWithSwaggerAdvance.repository;

import com.izdebski.SpringBootRESTfulAPIDocWithSwaggerAdvance.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}