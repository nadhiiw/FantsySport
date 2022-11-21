package com.project.FantasySport.players;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PlayerServiceTest {
    PlayerRepository playerRepository;
    PlayerService playerService;
    @Test
    void addPlayer() {
//        List<Player> players = new ArrayList<>();
//        players.add(new Player());
//        playerRepository.selectPlayerById(UUID.randomUUID());
//        List<Player> expected = playerService.getAllPlayer();
//        assertEquals(expected,players);
////        playerRepository.selectPlayerById(UUID.randomUUID());

    }

    @Test
    void getAllPlayer() {
        List<Player> players = new ArrayList<>();
        players.add(new Player());
        playerRepository.selectPlayerById(UUID.randomUUID());
        List<Player> expected = playerService.getAllPlayer();
        assertEquals(expected,players);
        playerRepository.selectPlayerById(UUID.randomUUID());
    }

    @Test
    void getPlayerById() {

    }

    @Test
    void deletePlayer() {
    }

    @Test
    void updatePlayer() {
    }
}