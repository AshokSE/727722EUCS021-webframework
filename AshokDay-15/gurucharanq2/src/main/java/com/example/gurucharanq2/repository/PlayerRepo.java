package com.example.gurucharanq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq2.model.Player;

public interface PlayerRepo extends JpaRepository<Player,Integer> {

}
