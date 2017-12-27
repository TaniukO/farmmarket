package ua.farmercoop.logic.test.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ua.farmercoop.logic.domain.Carrier;
import ua.farmercoop.logic.domain.maping.mapers.CarrierMapper;
import ua.farmercoop.logic.test.MyBatisUtil;

public class CarrierService
{

	public void insertCarrier(Carrier carrier)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			CarrierMapper carrierMapper = sqlSession.getMapper(CarrierMapper.class);
			carrierMapper.insertCarrier(carrier);
			sqlSession.commit();
		} finally
		{
			sqlSession.close();
		}
	}

	public Carrier getCarrierById(Long carrierId)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			CarrierMapper carrierMapper = sqlSession.getMapper(CarrierMapper.class);
			return carrierMapper.getCarrierById(carrierId);
		} finally
		{
			sqlSession.close();
		}
	}

	public List<Carrier> getAllCarriers()
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			CarrierMapper carrierMapper = sqlSession.getMapper(CarrierMapper.class);
			return carrierMapper.getAllCarriers();
		} finally
		{
			sqlSession.close();
		}
	}

	public void updateCarrier(Carrier carrier)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			CarrierMapper carrierMapper = sqlSession.getMapper(CarrierMapper.class);
			carrierMapper.updateCarrier(carrier);
			sqlSession.commit();
		} finally
		{
			sqlSession.close();
		}
	}

	public void deleteCarrier(Long carrierId)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			CarrierMapper carrierMapper = sqlSession.getMapper(CarrierMapper.class);
			carrierMapper.deleteCarrier(carrierId);
			sqlSession.commit();
		} finally
		{
			sqlSession.close();
		}
	}

}