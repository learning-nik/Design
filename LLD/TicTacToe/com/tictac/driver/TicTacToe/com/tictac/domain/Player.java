package com.tictac.driver.TicTacToe.com.tictac.domain;

import java.util.UUID;

public class Player {

	public Player() {
		this.id = UUID.randomUUID().toString();
	}

	private String id;

	private String name;

	private Piece piece;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

}
