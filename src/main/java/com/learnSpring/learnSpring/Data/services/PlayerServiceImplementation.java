package com.learnSpring.learnSpring.Data.services;

import com.learnSpring.learnSpring.Data.Entity.Player;
import com.learnSpring.learnSpring.Data.Repository.PlayerRepository;
import com.learnSpring.learnSpring.common.NotFoundElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImplementation implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player save(Player player) {
        return this.playerRepository.save(player);
    }

    @Override
    public Player update(Player player, Long playerId) {

        Optional<Player> PlayerOptional = this.playerRepository.findById(playerId);
        if (PlayerOptional.isPresent()) {
            Player newPlayer = PlayerOptional.get();
            newPlayer.setAge(player.getAge());
            newPlayer.setDrtg(player.getDrtg());
            newPlayer.setFullname(player.getFullname());
            newPlayer.setPosition(player.getPosition());
            newPlayer.setRanking(player.getRanking());
            newPlayer.setTeam(player.getTeam());
            this.playerRepository.save(newPlayer);
        }
        return PlayerOptional.orElseThrow(() -> new RuntimeException("Player not found"));
    }

    @Override
    public Optional<Player> findById(Long playerId) {
        return this.playerRepository.findById(playerId);
    }

    @Override
    public List<Player> findAll() {
        return this.playerRepository.findAll();
    }

    @Override
    public void deleteById(Long playerId) {
        /*
        if (this.playerRepository.findById(playerId).isPresent()) {
            this.playerRepository.deleteById(playerId);
        } else {
            throw new RuntimeException("Player not found");
        }
        * */

        Player playeroptional = this.playerRepository.findById(playerId).orElseThrow(NotFoundElementException::new);
        this.playerRepository.delete(playeroptional);
    }

    @Override
    public Page<Player> findAll(int page, int pageSize) {
        PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.ASC, "fullname"));
        return this.playerRepository.findAll(pageRequest);
    }
}
