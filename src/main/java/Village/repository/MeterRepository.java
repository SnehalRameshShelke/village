package Village.repository;

import Village.model.Meter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeterRepository extends JpaRepository<Meter,Long> {

 /*  public List<Meter> findAllByVillageId(Long id);*/
}
