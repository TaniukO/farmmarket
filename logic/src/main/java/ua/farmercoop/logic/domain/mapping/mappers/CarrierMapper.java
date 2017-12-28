package ua.farmercoop.logic.domain.mapping.mappers;

import java.util.List;

import org.mybatis.cdi.Mapper;

import ua.farmercoop.logic.domain.Carrier;

public interface CarrierMapper {

	void insertCarrier(Carrier carrier);

	Carrier getCarrierById(Long carrierId);

	List<Carrier> getAllCarriers();

	void updateCarrier(Carrier carrier);

	void deleteCarrier(Long carrierId);

}
