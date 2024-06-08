package com.sport.nba.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sport.nba.dto.TeamsData;
import com.sport.nba.gameerviceImpl.GameServiceImpl;

@RestController
@RequestMapping("/api")
public class GameRest {

	@Autowired
	GameServiceImpl gameServiceImpl;

	
	@GetMapping("/get-teams")
	public TeamsData getAllTeams() {
		TeamsData teams = gameServiceImpl.getTeams();
		System.out.println("teams : " + teams);
		return teams;
	}
}
