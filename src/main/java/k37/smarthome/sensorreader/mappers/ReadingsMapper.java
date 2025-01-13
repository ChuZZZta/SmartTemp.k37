package k37.smarthome.sensorreader.mappers;

import k37.smarthome.sensorreader.entities.readings.ReadingsDTO;
import k37.smarthome.sensorreader.entities.readings.ReadingsEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ReadingsMapper {
  ReadingsDTO mapEntityToDto(ReadingsEntity entity);

  ReadingsEntity mapDtoToEntity(ReadingsDTO dro);
}
