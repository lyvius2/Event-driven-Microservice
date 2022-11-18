package com.walter.product.domain.repository;

import com.walter.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
	Product findOneByProductNo(String productNo);
}
