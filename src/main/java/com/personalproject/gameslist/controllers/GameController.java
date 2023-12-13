package com.personalproject.gameslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalproject.gameslist.dto.GameDTO;
import com.personalproject.gameslist.dto.GameMinDTO;
import com.personalproject.gameslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	
	@GetMapping
	public List<GameMinDTO> findall () {
		var result = gameService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById (@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
	}

}
