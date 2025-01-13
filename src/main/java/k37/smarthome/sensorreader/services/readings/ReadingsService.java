package k37.smarthome.sensorreader.services.readings;

import k37.smarthome.sensorreader.entities.readings.ReadingsDTO;
import k37.smarthome.sensorreader.repositories.ReadingsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j
@RequiredArgsConstructor
public class ReadingsService implements IReadingsService {
    private ReadingsRepository repo;


    @Override
    public List<ReadingsDTO> getAllReadings() {
        return null;
    }
}
