package com.learnSpring.learnSpring.Data.Repository;

import com.learnSpring.learnSpring.Data.Entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    //JPA Query Method

    List<Player> findByFullname(String fullname);

    List<Player> findByFullnameContaining(String fullname);

    List<Player> findByTeamAndAge(String team, Integer age);

    Page<Player> findByTeam(String team, Pageable pageable);
}
