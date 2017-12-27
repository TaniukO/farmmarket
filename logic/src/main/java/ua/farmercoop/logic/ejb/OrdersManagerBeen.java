package ua.farmercoop.logic.ejb;

import java.util.Date;

import javax.ejb.*;
import javax.inject.Inject;

import ua.farmercoop.logic.domain.Order;
import ua.farmercoop.logic.domain.User;
import ua.farmercoop.logic.domain.maping.mapers.OrderMapper;

@Stateless
@LocalBean
public class OrdersManagerBeen{
    @Inject OrderMapper om;
        
    public Order createOrder(User user){
        Order order=new Order();
        order.setUserId(user.getId());
        order.setDateOrder( new Date());
        om.insertOrder(order);
        return order;
    }
}