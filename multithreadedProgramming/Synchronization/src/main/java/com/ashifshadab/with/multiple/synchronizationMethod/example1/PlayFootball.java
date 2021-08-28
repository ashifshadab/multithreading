package com.ashifshadab.with.multiple.synchronizationMethod.example1;

public class PlayFootball extends Thread {

	Game game;
	
	String playerName;

	public PlayFootball(Game game, String playerName) {
		super();
		this.game = game;
		this.playerName = playerName;
	}
	
	public void run() {
		
		game.football(playerName);
	}
	
}
