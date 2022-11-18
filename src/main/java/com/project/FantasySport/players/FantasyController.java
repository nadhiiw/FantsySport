package com.project.FantasySport.players;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/players")
public class FantasyController {

    private FantasyService fantasyService;

    public FantasyController(FantasyService fantasyService) {
        this.fantasyService = fantasyService;
    }

    @GetMapping
    public List<Fantasy> getPlayer(){
        return fantasyService.getPlayer();
    }
}
