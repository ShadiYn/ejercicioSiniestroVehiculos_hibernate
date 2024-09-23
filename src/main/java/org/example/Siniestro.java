package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

}
