package com.ashifshadab.with.multiple.synchronizationMethod.example1;

public class Play {

	public static void main(String[] args) {

		Game game = new Game();
		
		PlayCricket playCricket = new PlayCricket(game, "Raj");
		
		PlayFootball playFootball = new PlayFootball(game, "Mansi");
		
		PlayVideoGame playVideoGame = new PlayVideoGame(game, "Losy");
		
		playCricket.start();
		
		playFootball.start();
		
		playVideoGame.start();

	}

}
