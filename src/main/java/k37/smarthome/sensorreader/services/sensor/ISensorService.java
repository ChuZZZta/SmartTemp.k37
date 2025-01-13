package k37.smarthome.sensorreader.services.sensor;

import k37.smarthome.sensorreader.entities.sensor.SensorDTO;

public interface ISensorService {
    SensorDTO registerSensor(SensorDTO sensor);
}
