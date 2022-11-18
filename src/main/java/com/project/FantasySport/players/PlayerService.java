package com.project.FantasySport.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private FantasyPlayers fantasyPlayers;

    @Autowired
    public PlayerService(@Qualifier("player") FantasyPlayers fantasyPlayers) {
        this.fantasyPlayers = fantasyPlayers;
    }
    public int addPlayer(Player player){
        return fantasyPlayers.addPlayer(player);
    }

    public List<Player> getAllPlayer(){
        return fantasyPlayers.selectAllPlayers();
    }


}
