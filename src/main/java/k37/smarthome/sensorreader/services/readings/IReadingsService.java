package k37.smarthome.sensorreader.services.readings;

import k37.smarthome.sensorreader.entities.readings.ReadingsDTO;

import java.util.List;

public interface IReadingsService {
    List<ReadingsDTO> getAllReadings();
}
