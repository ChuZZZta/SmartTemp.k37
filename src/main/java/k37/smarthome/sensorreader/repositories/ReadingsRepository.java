package k37.smarthome.sensorreader.repositories;

import k37.smarthome.sensorreader.entities.readings.ReadingsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReadingsRepository extends CrudRepository<ReadingsEntity, Long> {}
