package ua.farmercoop.logic.domain.mapping.mappers;

import org.mybatis.cdi.Mapper;

import ua.farmercoop.logic.domain.Product;

public interface ProductMapper {
	void insertProduct(Product product);
	
}
