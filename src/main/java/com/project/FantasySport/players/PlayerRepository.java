package com.project.FantasySport.players;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class PlayerRepository implements FantasyPlayers {

    private static List<Player> players = new ArrayList<>();

    @Override
    public int startPLayer(UUID id, Player player) {
        players.add(new Player(id, player.getName(), player.getPosition(), player.getTeam(),player.getDob()));
        return 1;
    }

}
