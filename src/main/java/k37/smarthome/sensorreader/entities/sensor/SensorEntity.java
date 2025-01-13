package k37.smarthome.sensorreader.entities.sensor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import k37.smarthome.sensorreader.entities.SensorType;
import lombok.Data;

@Entity
@Data
public class SensorEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private SensorType type;
  private String name;
  private String address;
}
