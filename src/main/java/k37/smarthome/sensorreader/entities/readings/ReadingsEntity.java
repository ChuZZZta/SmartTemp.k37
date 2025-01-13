package k37.smarthome.sensorreader.entities.readings;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import k37.smarthome.sensorreader.entities.sensor.SensorEntity;
import lombok.Data;

@Entity
@Data
public class ReadingsEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private double value;
  private LocalDateTime dateTime;
  private SensorEntity sensor;
}
