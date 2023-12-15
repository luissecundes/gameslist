package com.personalproject.gameslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personalproject.gameslist.dto.GameDTO;
import com.personalproject.gameslist.dto.GameMinDTO;
import com.personalproject.gameslist.entities.Game;
import com.personalproject.gameslist.projection.GameMinProjection;
import com.personalproject.gameslist.repositories.GameRepository;

@Service
public class GameService {

	
		@Autowired
		private GameRepository gameRepository;
		
		@Transactional(readOnly = true)
		public GameDTO findById(Long id) {
			Game result = gameRepository.findById(id).get();
			GameDTO dto = new GameDTO(result);
			return dto;
		}
		
		@Transactional(readOnly = true)
		public List<GameMinDTO> findAll(){
			var result = gameRepository.findAll();
			var dto = result.stream().map(x -> new GameMinDTO(x)).toList();
			return dto;
		}
		
		@Transactional(readOnly = true)
		public List<GameMinDTO> findByList(Long listId){
			List<GameMinProjection> result = gameRepository.searchByList(listId);
			var dto = result.stream().map(x -> new GameMinDTO(x)).toList();
			return dto;
		}
}
