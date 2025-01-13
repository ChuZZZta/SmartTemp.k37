package k37.smarthome.sensorreader.services.sensor;

import k37.smarthome.sensorreader.entities.sensor.SensorDTO;
import k37.smarthome.sensorreader.mappers.SensorMapper;
import k37.smarthome.sensorreader.repositories.SensorRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
@Log4j
public class SensorService implements ISensorService {
  SensorRepository repo;
  SensorMapper mapper;

  @Override
  public SensorDTO registerSensor(SensorDTO sensor) {
    var sensorEntity = mapper.mapDtoToEntity(sensor);
    return mapper.mapEntityToDto(repo.save(sensorEntity));
  }
}
