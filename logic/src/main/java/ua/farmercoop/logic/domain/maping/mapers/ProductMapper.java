package ua.farmercoop.logic.domain.maping.mapers;

import org.mybatis.cdi.Mapper;

import ua.farmercoop.logic.domain.Product;

public interface ProductMapper {
	void insertProduct(Product product);
	
}
