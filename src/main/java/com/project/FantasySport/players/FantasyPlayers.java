package com.project.FantasySport.players;

import java.util.*;

public interface FantasyPlayers {
    int startPLayer(UUID id, Player player);

    default int addPlayer(Player player){
        UUID id = UUID.randomUUID();
        return startPLayer(id, player);
    }

    List<Player> selectAllPlayers();


}
