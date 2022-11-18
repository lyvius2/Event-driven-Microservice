package com.walter.product.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductV1 {
	@JsonProperty(value = "productNo")
	@Schema(description = "상품번호")
	private String productNo;

	@JsonProperty(value = "productName")
	@Schema(description = "상품명")
	private String productName;

	@JsonProperty(value = "price")
	@Schema(description = "상품가격")
	private long price;

	@JsonProperty(value = "stock")
	@Schema(description = "상품재고")
	private long stock;
}
