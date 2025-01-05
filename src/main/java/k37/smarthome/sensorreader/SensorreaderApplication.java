package k37.smarthome.sensorreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SensorreaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensorreaderApplication.class, args);
	}

}
