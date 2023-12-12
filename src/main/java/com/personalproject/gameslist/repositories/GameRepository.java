package com.personalproject.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.gameslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
