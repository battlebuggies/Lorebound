package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class SessionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String body;

    private LocalDate createdAt;

    @ManyToOne
    private Campaign campaign;


}
