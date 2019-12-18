package Village.Service;

import Village.model.Meter;
import Village.repository.MeterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeterService  {
    private final MeterRepository meterRepository;

    public MeterService(MeterRepository meterRepository) {
        this.meterRepository = meterRepository;
    }
    public List<Meter> findAll() {
        return meterRepository.findAll();
    }

    public Optional<Meter> findById(Long id) {
        return meterRepository.findById(id);
    }

    public Meter save(Meter stock) {
        return meterRepository.save(stock);
    }

    public void deleteById(Long id) {
        meterRepository.deleteById(id);
    }

 /*   public List<Meter> findAllByVillageId(Long id)
    {
       return meterRepository.findAllByVillageId(id);
    }*/
}
