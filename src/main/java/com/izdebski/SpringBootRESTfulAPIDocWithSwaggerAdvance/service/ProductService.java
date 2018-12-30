package com.izdebski.SpringBootRESTfulAPIDocWithSwaggerAdvance.service;

import com.izdebski.SpringBootRESTfulAPIDocWithSwaggerAdvance.model.Product;

public interface ProductService {
    public abstract Iterable<Product> listAllProducts();
    public abstract Product getProductById(Integer id);
    public abstract Product saveProduct(Product product);
    public abstract void deleteProduct(Integer id);
}