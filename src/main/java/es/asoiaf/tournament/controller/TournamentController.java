package es.asoiaf.tournament.controller;

import es.asoiaf.tournament.model.Tournament;
import es.asoiaf.tournament.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TournamentController {

    @Autowired
    TournamentRepository tournamentRepository;

    @GetMapping("/tournaments")
    public ResponseEntity<List<Tournament>> getAllTutorials(@RequestParam(required = false) String title) {
        try {
            List<Tournament> tournaments = new ArrayList<Tournament>();

            tournaments.addAll(tournamentRepository.findAll());


            if (tournaments.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(tournaments, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
