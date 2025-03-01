package com.learnSpring.learnSpring;

import com.learnSpring.learnSpring.Data.Entity.Player;
import com.learnSpring.learnSpring.Data.Repository.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class crudTest {

    Logger LOGGER = LoggerFactory.getLogger(crudTest.class);

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void addPlayer(){
        Player oPlayer = new Player(null, 10, "Cristiano Ronaldo", "Madrid", "Forward", 33, 5.0);
        this.playerRepository.save(oPlayer);
        Assertions.assertNotNull(oPlayer.getId(), () -> "Player id is null");
        System.out.println(oPlayer);
    }

    @Test
    void updatePlayer(){
        Player oPlayer = null;
        Integer currentAge = 0;
        oPlayer = this.playerRepository.findAll().getFirst();
        Assertions.assertNotNull(oPlayer, () -> "Player must not be null");
        currentAge = oPlayer.getAge();
        oPlayer.setAge(currentAge + 1);
        this.playerRepository.save(oPlayer);

        this.LOGGER.info("Player updated: {}", oPlayer);
        Assertions.assertTrue(oPlayer.getAge() > currentAge, () -> "Player age is less than the current age");
    }

    @Test
    void deletePlayer(){
        Player oPlayer = null;
        oPlayer = this.playerRepository.findAll().getLast();
        this.playerRepository.delete(oPlayer);

        oPlayer = this.playerRepository.findById(oPlayer.getId()).orElse(null);
        Assertions.assertNull(oPlayer, () -> "Player is not null");
        this.LOGGER.info("Player deleted: {}", oPlayer);
    }
}
