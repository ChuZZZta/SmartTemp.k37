package k37.smarthome.sensorreader.repositories;

import k37.smarthome.sensorreader.entities.sensor.SensorEntity;
import org.springframework.data.repository.CrudRepository;

public interface SensorRepository extends CrudRepository<SensorEntity, Long> {}
