package k37.smarthome.sensorreader.controlers;

import java.util.List;
import k37.smarthome.sensorreader.entities.readings.ReadingsDTO;
import k37.smarthome.sensorreader.services.readings.IReadingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReadingsController {

  IReadingsService service;

  @GetMapping(value = "/readings/all")
  public List<ReadingsDTO> getAllReadings() {
    var readingsList = service.getAllReadings();
    return readingsList;
  }
}
