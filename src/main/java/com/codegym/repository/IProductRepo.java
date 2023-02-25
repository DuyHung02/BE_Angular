package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product, Long> {

}
