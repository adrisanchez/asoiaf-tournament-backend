package es.asoiaf.tournament.repository;

import es.asoiaf.tournament.model.TournamentPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentPlayerRepository extends JpaRepository<TournamentPlayer, Long> {
    // No additional methods needed, as the JpaRepository interface provides the basic CRUD operations
}
