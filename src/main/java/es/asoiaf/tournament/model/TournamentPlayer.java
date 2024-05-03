package es.asoiaf.tournament.model;

import es.asoiaf.tournament.enums.Faction;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tournamentPlayers")
public @Data class TournamentPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JoinColumn(name = "player", referencedColumnName = "id")
    private Player player;

    @Column(name = "faction")
    private Faction faction;

}
