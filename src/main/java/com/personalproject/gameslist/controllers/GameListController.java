package com.personalproject.gameslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalproject.gameslist.dto.GameListDTO;
import com.personalproject.gameslist.dto.GameMinDTO;
import com.personalproject.gameslist.services.GameListService;
import com.personalproject.gameslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> findall() {
		var result = gameListService.findAll();
		return result;
	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findBylist(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}

}
