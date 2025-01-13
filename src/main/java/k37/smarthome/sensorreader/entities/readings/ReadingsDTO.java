package k37.smarthome.sensorreader.entities.readings;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReadingsDTO {
  private Integer id;
  private double value;
  private LocalDateTime dateTime;
  private UUID sensor;
}
