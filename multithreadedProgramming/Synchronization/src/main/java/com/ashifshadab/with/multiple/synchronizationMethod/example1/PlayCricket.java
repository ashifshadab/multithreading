package com.ashifshadab.with.multiple.synchronizationMethod.example1;

public class PlayCricket extends Thread {

	Game game;
	
	String playerName;

	public PlayCricket(Game game, String playerName) {
		super();
		this.game = game;
		this.playerName = playerName;
	}
	
	public void run() {
		
		game.cricket(playerName);
	}
	
}
