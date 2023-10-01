package com.tictac.domain;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {

	//private Board board;

	final Piece[][] pieces = new Piece[3][3];

	private Queue<Player> players = new LinkedList<>();

	public Game(String player1Name, String piece1Name, String player2Name, String piece2Name) {
		initializeGame(player1Name, piece1Name, player2Name, piece2Name);
	}

	public void startGame() {

		while (true) {
			Player last = players.poll();
			System.out.println(last.getName()+"'s Turn");

			Scanner sc = new Scanner(System.in);

			String input = sc.next();
			String position[] = input.split(",");
			int row = Integer.parseInt(position[0]);
			int column = Integer.parseInt(position[1]);
			System.out.println();

			pieces[row][column] = last.getPiece();

			printBoard();

			if (gameHasFinished(row, column, pieces[row][column].toString())) {
				System.out.println("--------------");
				System.out.println("GAME FINISHED");
				System.out.println("WINNER IS: "+last.getName());
				break;
			}
			
			players.add(last);

		}
	}

	private void printBoard() {

		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < pieces[0].length; j++) {
				System.out.print(pieces[i][j] + " ");
			}
			System.out.println();
		}

	}

	private boolean gameHasFinished(int row, int column, String value) {

		// check for in that row
		int count =0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[row][i] != null && value.equals(pieces[row][i].toString())) {
				count ++;
			}
		}
		if(count == pieces.length) {
			return true;
		}

		int columnCount =0;	
		// check for in that column
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i][column] != null && value.equals(pieces[i][column].toString())) {
				columnCount++;
			}
		}
		if(columnCount == pieces.length) {
			return true;
		}

		// check for in that diagonal
		/*
		for (int i = 0; i < pieces.length; i++) {
			if (!pieces[i][column].toString().equals(value)) {
				return false;
			}
		}*/

		return false;
	}

	public void initializeGame(String player1Name, String piece1Name, String player2Name, String piece2Name) {

		Board board = new Board();
		addPlayers(player1Name, piece1Name, player2Name, piece2Name);

	}

	private void addPlayers(String player1Name, String piece1Name, String player2Name, String piece2Name) {
		Player one = new Player();
		one.setName(player1Name);
		if (piece1Name.equals(Piece.X.toString())) {
			one.setPiece(Piece.X);
		} else {
			one.setPiece(Piece.O);
		}

		Player two = new Player();
		two.setName(player2Name);
		if (piece2Name.equals(Piece.X.toString())) {
			two.setPiece(Piece.X);
		} else {
			two.setPiece(Piece.O);
		}

		players.add(one);
		players.add(two);
	}

}
