package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Siniestro {
    @Id
    @GeneratedValue
    private int id;

    private Date fecha;
    private int perdida;

    @ManyToOne
    @JoinColumn(name = "vehiculo_id", nullable = false) // Clave foránea en la tabla Siniestro
    private Vehiculo vehiculo;

}
