package com.personalproject.gameslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personalproject.gameslist.dto.GameListDTO;
import com.personalproject.gameslist.entities.GameList;
import com.personalproject.gameslist.repositories.GameListRepository;

@Service
public class GameListService {

	
		@Autowired
		private GameListRepository gameListRepository;
		
		@Transactional(readOnly = true)
		public List<GameListDTO> findAll() {
			List<GameList> result = gameListRepository.findAll();
			var dto = result.stream().map(x -> new GameListDTO(x)).toList();
			return dto;
		}
}
