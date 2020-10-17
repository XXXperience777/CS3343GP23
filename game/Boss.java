package com.game;

import java.util.*;

public class Boss {

	int x;
	int y;
	int fx;
	int width = 424;
	int height = 128;
	boolean alive;
	int k = 1;
	int count = 0;
	int blood = 200;
	java.util.Random random = new Random();
	GameStart gs;
	public Collection<BulletBoss> bullets = new ArrayList<BulletBoss>();
	private FireMode fireMode;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param gs
	 * @param alive
	 */
	public Boss(int x, int y, GameStart gs, boolean alive) {
		// TODO - implement Boss.Boss
		throw new UnsupportedOperationException();
	}

	public void isHitted() {
		// TODO - implement Boss.isHitted
		throw new UnsupportedOperationException();
	}

	public void expolde() {
		// TODO - implement Boss.expolde
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	public void drawMe(java.awt.Graphics g) {
		// TODO - implement Boss.drawMe
		throw new UnsupportedOperationException();
	}

	private void move() {
		// TODO - implement Boss.move
		throw new UnsupportedOperationException();
	}

	public java.awt.Rectangle getRectangle() {
		// TODO - implement Boss.getRectangle
		throw new UnsupportedOperationException();
	}

}