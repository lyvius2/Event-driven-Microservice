package com.walter.product.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Table(name = "product")
@Entity
public class Product {
	@Id
	@Column(name = "product_no")
	private String productNo;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "price")
	private long price;

	@Column(name = "stock")
	private long stock;

	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
