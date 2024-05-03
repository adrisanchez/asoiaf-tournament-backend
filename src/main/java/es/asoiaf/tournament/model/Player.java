package es.asoiaf.tournament.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "players")
public @Data class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

}
