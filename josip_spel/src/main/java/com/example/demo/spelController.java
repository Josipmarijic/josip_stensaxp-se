package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path="/spela")
@RestController
public class spelController {
	
	private GameModel newGame = new GameModel();
	
	@RequestMapping
	public String playGame(String playerOneMove) {
		newGame.setPlayerMove(playerOneMove);
		newGame.setComputerMove();
	
		
		String result = newGame.playGame();
		
		
		return result;
	}
	
	@RequestMapping(
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public String totalScore(){
		return ObjectJson();
	}
	
	private String ObjectJson() {
		return "{"+ 
				
				"\"Player 1\":" + 
					"[{"+
						"\"PlayerScore\":" + "\"" + newGame.getPlayerScore() + "\""+ 
						"," +
					"}]"+
				"," +
				
				"\"Computer\":" + 
					"[{"+
						"\"ComputerScore\":" + "\"" + newGame.getComputerScore() + "\""+ 
						"," +
					"}]"+
				"}";
	}
	
	
}
