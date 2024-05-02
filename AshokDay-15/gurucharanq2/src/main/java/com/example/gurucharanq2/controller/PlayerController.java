package com.example.gurucharanq2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.gurucharanq2.model.Player;
import com.example.gurucharanq2.service.PlayerService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@Slf4j
public class PlayerController {
    @Autowired
    public PlayerService playerService;

    @GetMapping("/players")
    public List<Player> getMethodName() {
        log.info("method={GET}");
        return playerService.getData();
    }

    @GetMapping("/players/{playerId}")
    public Player getOneMethodName(@PathVariable int id){
        log.info("method={GET}");
        return playerService.getOneData(id);
    }
    
    @PostMapping("/players")
    public Player postMethodName(@RequestBody Player entity) {
        log.info("method={POST}");
        return playerService.postData(entity);
    }
    
}
