package com.codegym.service.product;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductRepo iProductRepo;

    @Override
    public List<Product> findAll() {
        return (List<Product>) iProductRepo.findAll();
    }

    @Override
    public Product save(Product product) {
        iProductRepo.save(product);
        return product;
    }

    @Override
    public Product delete(Product product) {
        iProductRepo.delete(product);
        return product;
    }

    @Override
    public Product findById(long id) {
        return iProductRepo.findById(id).get();
    }
}
