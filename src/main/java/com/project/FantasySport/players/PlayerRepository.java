package com.project.FantasySport.players;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository("player")
public class PlayerRepository implements FantasyPlayers {

    private static List<Player> players = new ArrayList<>();

    @Override
    public int startPLayer(UUID id, Player player) {
        players.add(new Player(id, player.getName(), player.getPosition(), player.getTeam(),player.getDob()));
        return 1;
    }

    @Override
    public List<Player> selectAllPlayers() {
        return players;
    }

    @Override
    public Optional<Player> selectPlayerById(UUID id) {
        return players.stream().filter(player -> player.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePlayerById(UUID id) {
        Optional<Player> player = selectPlayerById(id);
        if(player.isEmpty()){
            return 0;
        }
        players.remove(player.get());
        return 1;
    }

    @Override
    public int updatePlayerById(UUID id, Player player) {
        return selectPlayerById(id).map(player1 -> {
            int indexOfPlayer = players.indexOf(player);
            if(indexOfPlayer >= 0) {
                players.set(indexOfPlayer,player);
            }
            return 0;
        })
                .orElse(0);
    }




}
