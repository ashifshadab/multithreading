package com.ashifshadab.with.multiple.synchronizationMethod.example1;

public class PlayVideoGame extends Thread {

	Game game;
	
	String playerName;

	public PlayVideoGame(Game game, String playerName) {
		super();
		this.game = game;
		this.playerName = playerName;
	}
	
	public void run() {
		
		game.videoGame(playerName);
	}
	
}
