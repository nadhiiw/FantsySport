package com.project.FantasySport.players;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/players")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public int getPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }

    @GetMapping
    public List<Player> getAllPlayer(){
        return playerService.getAllPlayer();
    }


}
