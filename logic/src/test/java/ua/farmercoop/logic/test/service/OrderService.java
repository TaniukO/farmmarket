package ua.farmercoop.logic.test.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ua.farmercoop.logic.domain.Order;
import ua.farmercoop.logic.domain.maping.mapers.OrderMapper;
import ua.farmercoop.logic.test.MyBatisUtil;

public class OrderService
{

	public void insertOrder(Order order)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orderMapper.insertOrder(order);
			sqlSession.commit();
		} finally
		{
			sqlSession.close();
		}
	}

	public Order getOrderById(Long orderId)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			return orderMapper.getOrderById(orderId);
		} finally
		{
			sqlSession.close();
		}
	}

	public List<Order> getAllOrders()
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			return orderMapper.getAllOrders();
		} finally
		{
			sqlSession.close();
		}
	}

	public void updateOrder(Order order)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orderMapper.updateOrder(order);
			sqlSession.commit();
		} finally
		{
			sqlSession.close();
		}
	}

	public void deleteOrder(Long orderId)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orderMapper.deleteOrder(orderId);
			sqlSession.commit();
		} finally
		{
			sqlSession.close();
		}
	}

}