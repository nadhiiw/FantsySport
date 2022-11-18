package com.project.FantasySport.players;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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


}
