package es.asoiaf.tournament.repository;

import es.asoiaf.tournament.model.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    // No additional methods needed, as the JpaRepository interface provides the basic CRUD operations
}
