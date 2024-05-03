package es.asoiaf.tournament.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tournaments")
public @Data class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "tournamentName")
    private String tournamentName;

    @ElementCollection
    @Column(name = "tournamentPlayerList")
    private List<TournamentPlayer> tournamentPlayerList;

    @ElementCollection
    @Column(name = "rounds")
    private List<Round> rounds;

    @JoinColumn(name = "currentRound", referencedColumnName = "id")
    private Round currentRound;

}
