package com.learnSpring.learnSpring.Data.Repository;

import com.learnSpring.learnSpring.Data.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
