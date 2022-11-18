package com.walter.product.api.v1;

import com.walter.product.domain.dto.ProductV1;
import com.walter.product.domain.mapper.ProductMapper;
import com.walter.product.domain.service.ProductService;
import com.walter.product.entity.Product;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@Tag(name = "상품 API")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@Operation(summary = "상품 정보 조회", description = "상품 정보를 조회하는 API")
	@GetMapping(value = "/{productNo}")
	public ProductV1 findProduct(@PathVariable(name = "productNo") String productNo) {
		final Product product = productService.findProduct(productNo);
		return ProductMapper.INSTANCE.toDto(product);
	}
}
