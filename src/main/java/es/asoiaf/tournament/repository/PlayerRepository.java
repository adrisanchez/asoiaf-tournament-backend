package es.asoiaf.tournament.repository;

import es.asoiaf.tournament.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    // No additional methods needed, as the JpaRepository interface provides the basic CRUD operations
}
