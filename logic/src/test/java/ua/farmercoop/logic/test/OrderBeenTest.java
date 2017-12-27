package ua.farmercoop.logic.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/*
import org.junit.runner.RunWith;
import org.jglue.cdiunit.*;
*/
import ua.farmercoop.logic.domain.Carrier;
import ua.farmercoop.logic.domain.Order;
/*
import ua.farmercoop.logic.domain.maping.mapers.CarrierMapper;
import ua.farmercoop.logic.domain.maping.mapers.OrderMapper;
*/
import ua.farmercoop.logic.test.service.CarrierService;
//import javax.inject.Inject;
import ua.farmercoop.logic.test.service.OrderService;


//@RunWith(CdiRunner.class)

public class OrderBeenTest {
    //@Inject
   private static OrderService os;
    //@Inject
   private static CarrierService cs;

@BeforeClass
public static void beforeClass() throws Exception {
	os = new OrderService();
	cs= new CarrierService();
}

@AfterClass
public static void afterClass() throws Exception {
	os=null;
	cs=null;
}
@Before
public void before() {}
@After
public void after() {
}


@Test
public void testInsertOrder(){
    Order order=new Order();
    Carrier carrier=new Carrier("name","deckription");
    cs.insertCarrier(carrier);
    order.setUserId(1L);
    order.setDateOrder( new Date());
    order.setMoveToAdress("adress");
    order.setCarriers(carrier);
    os.insertOrder(order);

	Assert.assertTrue(order.getId() != 0);
	Order createdOrder = os.getOrderById(order.getId());
	Assert.assertNotNull(createdOrder);
	Assert.assertEquals(order.getDateOrder(), createdOrder.getDateOrder());
	Assert.assertEquals(new BigDecimal(0), createdOrder.getSumPrice());
	Assert.assertEquals(order.getMoveToAdress(), "adress");
	Assert.assertEquals(order.getCarriers(), createdOrder.getCarriers());
	System.out.println(order.toString());
}

@Test
public void testUpdateOrder(){
	long timestamp = System.currentTimeMillis();
	Order order = os.getOrderById(1L);
	order.setNote("TestNote" + timestamp);
	order.setSumPrice(new BigDecimal(123456789L));
	os.updateOrder(order);
	Order updatedOrder = os.getOrderById(1L);
	Assert.assertEquals(order.getNote(), updatedOrder.getNote());
	Assert.assertEquals(order.getSumPrice(), updatedOrder.getSumPrice());
	System.out.println(order.toString());
}

@Test
public void testGetOrderById(){
	Order order = os.getOrderById(1L);
	Assert.assertNotNull(order);
	System.out.println(order.toString());
}

@Test
public void testGetAllOrders(){
	List<Order> orders = os.getAllOrders();
	Assert.assertNotNull(orders);
	for (Order order : orders)
	{
		System.out.println(order);
	}
}

@Test
public void testDeleteOrder(){
	Order order = os.getOrderById(2L);
	os.deleteOrder(order.getId());
	Order deletedOrder = os.getOrderById(2L);
	Assert.assertNull(deletedOrder);
	os.insertOrder(order);
}
}
