package Village.Bootstrap;

import Village.Service.MeterService;
import Village.model.Meter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static Village.model.enumeration.Status.Active;

@Component
    public class DataLoader implements CommandLineRunner {

        private final MeterService meterService;

        public DataLoader(MeterService meterService) {
            this.meterService = meterService;
        }


        @Override
        public void run(String... args) throws Exception {

          Meter meter=new Meter();
            meter.setId(1L);
            meter.setIdNumber("1234");
            meter.setStatus(Active);
            meter.setCurrentReading("123");

            meterService.save(meter);

            Meter meter1=new Meter();
            meter1.setId(2L);
            meter1.setIdNumber("12345");
            meter1.setStatus(Active);
            meter1.setCurrentReading("12367");

            meterService.save(meter1);

            System.out.println("------------------Booking Details Added------------------");

        }
    }


