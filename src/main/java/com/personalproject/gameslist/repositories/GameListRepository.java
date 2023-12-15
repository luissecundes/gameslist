package com.personalproject.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.gameslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
