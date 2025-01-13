package k37.smarthome.sensorreader.mappers;

import k37.smarthome.sensorreader.entities.sensor.SensorDTO;
import k37.smarthome.sensorreader.entities.sensor.SensorEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SensorMapper {
  SensorDTO mapEntityToDto(SensorEntity entity);

  SensorEntity mapDtoToEntity(SensorDTO dro);
}
