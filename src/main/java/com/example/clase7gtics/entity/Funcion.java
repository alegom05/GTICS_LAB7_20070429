package com.example.clase7gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "funciones")
@Getter
@Setter
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "obraId", nullable = false)
    private Obra obra;

    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    private Room room;

    @Column
    private Date funcionDate;

    @Column
    private int availableSeats;
}
