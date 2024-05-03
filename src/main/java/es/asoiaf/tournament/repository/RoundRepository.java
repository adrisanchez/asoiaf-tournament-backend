package es.asoiaf.tournament.repository;

import es.asoiaf.tournament.model.Round;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundRepository extends JpaRepository<Round, Long> {
    // No additional methods needed, as the JpaRepository interface provides the basic CRUD operations
}
