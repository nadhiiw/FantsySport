package com.project.FantasySport.players;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/players")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public void getPlayer(@RequestBody Player player){
         playerService.addPlayer(player);
    }

    @GetMapping
    public List<Player> getAllPlayer(){
        return playerService.getAllPlayer();
    }

    @GetMapping(path = "{id}")
    public Player getPlayerById(@PathVariable("id") UUID id){
        return playerService.getPlayerById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePlayer(@PathVariable("id") UUID id){
        playerService.deletePlayer(id);
    }

    @PutMapping(path = "{id}")
    public void updatePlayer(@PathVariable("id") UUID id, @RequestBody Player playerUpdate){
        playerService.updatePlayer(id, playerUpdate);
    }

}
