package com.learnSpring.learnSpring.controllers;

import com.learnSpring.learnSpring.Data.Entity.Player;
import com.learnSpring.learnSpring.Data.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return playerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
        return  ResponseEntity.of(playerService.findById(id));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerById(@PathVariable Long id) {
        playerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        return ResponseEntity.created(null).body(this.playerService.save(player));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        return ResponseEntity.ok(this.playerService.update(player, id));
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Player>> findAll(@RequestParam(defaultValue = "0", value = "page") Integer pageNumber,
                                                @RequestParam(defaultValue = "50", value = "size" ) Integer pageSize) {
        return ResponseEntity.ok(this.playerService.findAll(pageNumber, pageSize));
    }
}
