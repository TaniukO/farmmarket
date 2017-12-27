package ua.farmercoop.logic.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ua.farmercoop.logic.domain.Product;
import ua.farmercoop.logic.domain.maping.mapers.ProductMapper;

@Stateless
@LocalBean
public class ProductManagerBeen{
    @Inject ProductMapper pm;
    public Product createProduct(){
    	Product product=new Product();
    	product.setName("name");
    	pm.insertProduct(product);
    	return product;
    }
}