package com.tictac.driver.TicTacToe.com.tictac.driver;

import com.tictac.driver.TicTacToe.com.tictac.domain.Game;

public class Driver {

	Game game;

	public static void main(String[] args) {

		new Driver().start();

	}

	private void start() {
		// added players.
		game = new Game("NIKHIL", "X", "KOMAL", "Y");
		
		System.out.println("GAME STARTED");
		
		game.startGame();
		
		/*Scanner sc1= new Scanner(System.in);
		
		System.out.println(sc1.nextInt());*/
		
		
		
	}

}
