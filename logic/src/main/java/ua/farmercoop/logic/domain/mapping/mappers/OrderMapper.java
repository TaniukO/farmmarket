package ua.farmercoop.logic.domain.mapping.mappers;

import java.util.List;

import org.mybatis.cdi.Mapper;

import ua.farmercoop.logic.domain.Order;
import ua.farmercoop.logic.domain.Product;

public interface OrderMapper {
	public void insertOrder(Order order);

	public Order getOrderById(long id);
	public List<Product> selectProductsForOrders(); 

	public List<Order> getAllOrders();

	public void updateOrder(Order order);

	public void deleteOrder(long id);
}
