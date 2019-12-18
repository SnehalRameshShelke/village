package Village.model;


import Village.model.enumeration.Status;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Meter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "idNumber")
    private String idNumber;

   @Column(name = "currentReading")
    private String currentReading;


    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

}
