package com.walter.product.domain.mapper;

import com.walter.product.domain.dto.ProductV1;
import com.walter.product.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

	ProductV1 toDto(Product product);
}
