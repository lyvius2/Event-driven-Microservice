package com.walter.product.domain.service;

import com.walter.product.domain.repository.ProductRepository;
import com.walter.product.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product findProduct(String productNo) {
		return productRepository.findOneByProductNo(productNo);
	}
}
