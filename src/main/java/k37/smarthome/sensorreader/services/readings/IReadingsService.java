package k37.smarthome.sensorreader.services.readings;

import java.util.List;
import k37.smarthome.sensorreader.entities.readings.ReadingsDTO;

public interface IReadingsService {
  List<ReadingsDTO> getAllReadings();
}
