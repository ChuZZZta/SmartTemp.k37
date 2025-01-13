package k37.smarthome.sensorreader.services.readings;

import java.util.List;
import java.util.stream.StreamSupport;
import k37.smarthome.sensorreader.entities.readings.ReadingsDTO;
import k37.smarthome.sensorreader.mappers.ReadingsMapper;
import k37.smarthome.sensorreader.repositories.ReadingsRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Service
@Log4j
@AllArgsConstructor
@RequiredArgsConstructor
public class ReadingsService implements IReadingsService {
  private ReadingsRepository repo;
  private ReadingsMapper mapper;

  @Override
  public List<ReadingsDTO> getAllReadings() {
    var allReadings = repo.findAll();
    return StreamSupport.stream(allReadings.spliterator(), false)
        .map(mapper::mapEntityToDto)
        .toList();
  }
}
