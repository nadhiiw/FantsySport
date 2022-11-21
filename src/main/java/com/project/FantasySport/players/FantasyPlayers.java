package com.project.FantasySport.players;

import java.util.*;

public interface FantasyPlayers {
    int addNewPLayer(UUID id, Player player);

    default int addPlayer(Player player){
        UUID id = UUID.randomUUID();
        return addNewPLayer(id, player);
    }

    List<Player> selectAllPlayers();

    Optional<Player> selectPlayerById(UUID id);

    int deletePlayerById(UUID id);

    int updatePlayerById(UUID id, Player player);


}
