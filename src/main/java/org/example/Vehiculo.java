package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
}
