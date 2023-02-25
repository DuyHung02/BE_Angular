package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface CrudService<E> {
    List<E> findAll();

    Product save(E e);

    Product delete(E e);

    E findById(long id);
}
