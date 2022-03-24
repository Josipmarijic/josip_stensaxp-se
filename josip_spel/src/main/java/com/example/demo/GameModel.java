package com.example.demo;

public class GameModel {
	
	private Player playerOne = new Player();
	private Player computer = new Player();
	
	
	public void setPlayerMove(String playerMove) {
		
		this.playerOne.setMove(playerMove);
		
	}
	
	public void setComputerMove() {
		
		this.computer.setComputerMove();
	}
	
	public int getPlayerScore() {
		return this.playerOne.getScore();
	}
	
	public int getComputerScore() {
		return this.computer.getScore();
	}
	public String playGame() {
		
		String playerMove = this.playerOne.getMove();
		String computerMove = this.computer.getMove();
		
		switch (playerMove) {
		case "rock":
			
			switch (computerMove) {
			case "rock":
				break;
				
				
			case "scissors":
				playerOne.setScore();
				break;
			
			case "paper":
				computer.setScore();
				break;	
			
			}
			break;
			
		case "scissors":
			
			switch (computerMove) {
			case "rock":
				computer.setScore();
				break;
			
			case "scissors":
				break;
				
			case "paper":
				playerOne.setScore();
				break;
			}
			
			break;
		case "paper":
			
			switch (computerMove) {
			case "rock":
				playerOne.setScore();
				break;
				
			case "scissors":
				computer.setScore();
				break;
				 
			case "paper":
				break;
			}
			
			break;

			
		
		}
		
		return "Player score: " + playerOne.getScore() + " --- Computer score: " + computer.getScore();
		
	
	}
	
	

}
