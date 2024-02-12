package com.globallogic.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.practice.entity.Product;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
