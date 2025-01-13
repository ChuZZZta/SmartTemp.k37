package k37.smarthome.sensorreader.entities.sensor;

import k37.smarthome.sensorreader.entities.SensorType;
import lombok.Data;

@Data
public class SensorDTO {
  private Integer id;
  private SensorType type;
  private String name;
  private String address;
}
