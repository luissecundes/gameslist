package com.personalproject.gameslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalproject.gameslist.dto.GameMinDTO;
import com.personalproject.gameslist.repositories.GameRepository;

@Service
public class GameService {

	
		@Autowired
		private GameRepository gameRepository;
		
		public List<GameMinDTO> findAll(){
			var result = gameRepository.findAll();
			var dto = result.stream().map(x -> new GameMinDTO(x)).toList();
			return dto;
		}
}
