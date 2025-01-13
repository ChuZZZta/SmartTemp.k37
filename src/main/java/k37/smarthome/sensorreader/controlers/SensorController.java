package k37.smarthome.sensorreader.controlers;

import k37.smarthome.sensorreader.entities.sensor.SensorDTO;
import k37.smarthome.sensorreader.services.sensor.ISensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SensorController {
  ISensorService service;

  @PostMapping(value = "/sensor/register")
  public SensorDTO registerSensor(@RequestBody SensorDTO sensorDTO) {
    var registeredSensor = service.registerSensor(sensorDTO);
    return registeredSensor;
  }
}
