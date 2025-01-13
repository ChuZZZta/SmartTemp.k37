package k37.smarthome.sensorreader.services;

import k37.smarthome.sensorreader.services.sensor.SensorReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CronService {
    @Autowired
    SensorReaderService sensorReaderService;

    @Scheduled(cron = "0 * * * * *") // Cron expression for running every minute
    public void execute() {
        sensorReaderService.test();
    }
}
