package com.project.FantasySport.players;

import java.time.LocalDate;
import java.util.List;

public class FantasyService {

    public List<Fantasy> getPlayer(){
        return List.of(
                new Fantasy(
                        "nadhi",
                        "Forward",
                        "Liverpool",
                        LocalDate.of(1994,04,03)
                )
        );
    }
}
