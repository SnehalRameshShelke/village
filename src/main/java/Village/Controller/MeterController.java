package Village.Controller;

import Village.Service.MeterService;
import Village.model.Meter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController

public class MeterController {
    private final MeterService meterService;

    public MeterController(MeterService meterService) {
        this.meterService = meterService;
    }

    @GetMapping("/meters")
    public ResponseEntity<List<Meter>> findAll() {
        return ResponseEntity.ok(meterService.findAll());
    }

    @PostMapping("/meters")
    public ResponseEntity create(@Valid @RequestBody Meter meter) {
        return ResponseEntity.ok(meterService.save(meter));
    }

    @GetMapping("/meters/{id}")
    public ResponseEntity<Meter> findById(@PathVariable Long id) {
        Optional<Meter> stock = meterService.findById(id);
        if (!stock.isPresent()) {

            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(stock.get());
    }


    @PutMapping("meters/{id}")
    public ResponseEntity<Meter> update(@PathVariable Long id, @Valid @RequestBody Meter product) {
        if (!meterService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(meterService.save(product));
    }

    @DeleteMapping("meters/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (!meterService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        meterService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
