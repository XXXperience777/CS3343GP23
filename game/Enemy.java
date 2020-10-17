package com.game;

public class Enemy {

	int x;
	int y;
	int fx;
	int width = 68;
	int height = 68;
	boolean alive;
	java.awt.Image enemyImg;
	int k = 1;
	java.util.Random random = new Random();
	GameStart gs;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param alive
	 * @param gs
	 */
	public Enemy(int x, int y, boolean alive, GameStart gs) {
		// TODO - implement Enemy.Enemy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	public void drawMe(java.awt.Graphics g) {
		// TODO - implement Enemy.drawMe
		throw new UnsupportedOperationException();
	}

	public void fire() {
		// TODO - implement Enemy.fire
		throw new UnsupportedOperationException();
	}

	public void isHitted() {
		// TODO - implement Enemy.isHitted
		throw new UnsupportedOperationException();
	}

	public java.awt.Rectangle getRectangle() {
		// TODO - implement Enemy.getRectangle
		throw new UnsupportedOperationException();
	}

	public void move() {
		// TODO - implement Enemy.move
		throw new UnsupportedOperationException();
	}

}