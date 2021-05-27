package Entities.concretes;

import Entities.abstracts.Entity;

public class Game implements Entity{
	
	private String gameName;
	private int gameId;
	private double price;
	private String description;
	
	public Game() {
		
	}
	
	public Game(String gameName, int gameId, String description, double price) {
		super();
		this.gameName = gameName;
		this.gameId = gameId;
		this.price = price;
		this.description = description;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
