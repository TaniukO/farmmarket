@Stateless
@localBeen
public class OrdersManagerBeen{
    @inject OrderMapper om;
        
    public Order createOrder(User user){
        Order order=new Order();
        order.setUserID(user.getId());
        order.setDateOrder( new Date());
        this.om.inserOrder(order);
        return order;
    }
}