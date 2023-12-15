package com.personalproject.gameslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalproject.gameslist.dto.GameListDTO;
import com.personalproject.gameslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	
	@GetMapping
	public List<GameListDTO> findall () {
		var result = gameListService.findAll();
		return result;
	}
	

}
