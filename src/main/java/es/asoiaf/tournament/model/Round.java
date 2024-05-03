package es.asoiaf.tournament.model;

import es.asoiaf.tournament.enums.Map;
import es.asoiaf.tournament.enums.Sceno;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "rounds")
public @Data class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "roundNumber")
    private int roundNumber;

    @Column(name = "table")
    private int table;

    @Column(name = "sceno")
    private Sceno sceno;

    @Column(name = "map")
    private Map map;

    @JoinColumn(name = "player1", referencedColumnName = "id")
    private TournamentPlayer player1;

    @JoinColumn(name = "player2", referencedColumnName = "id")
    private TournamentPlayer player2;

    @Column(name = "primaryPointsPlayer1")
    private int primaryPointsPlayer1;

    @Column(name = "primaryPointsPlayer1")
    private int secondaryPointsPlayer1;

    @Column(name = "destroyedPointsPlayer1")
    private int destroyedPointsPlayer1;

    @Column(name = "primaryPointsPlayer2")
    private int primaryPointsPlayer2;

    @Column(name = "secondaryPointsPlayer2")
    private int secondaryPointsPlayer2;

    @Column(name = "destroyedPointsPlayer2")
    private int destroyedPointsPlayer2;

}