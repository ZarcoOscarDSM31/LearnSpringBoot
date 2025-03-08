package com.learnSpring.learnSpring;

import com.learnSpring.learnSpring.Data.Entity.Player;
import com.learnSpring.learnSpring.Data.Repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class JPAQueryMethods {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void findByFullname() {
        String fullname = "batman negro";
        playerRepository.findByFullname(fullname).forEach(System.out::println);
    }

    @Test
    void findByFullnameContaining() {
        String name = "batman";
        playerRepository.findByFullnameContaining(name).forEach(System.out::println);
    }

    @Test
    void findByTeamAndAge() {
        String team = "marvel";
        Integer age = 150;
        playerRepository.findByTeamAndAge(team, age).forEach(System.out::println);
    }

    @Test
    void findByTeam() {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Player> page = this.playerRepository.findByTeam("marvel", pageable);
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }
}
