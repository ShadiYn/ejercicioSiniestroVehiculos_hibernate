package org.example;

import lombok.Getter;
import lombok.Setter;
import javax. persistence. CascadeType;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Vehiculo {
    @Id
    @GeneratedValue
    private int id;

    private String matricula;
    private int asientos;
    private String marca;
    private int ruedas;

    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Siniestro> siniestros;
}
