package com.game;

public class Bullet {

	int x;
	int y;
	double speed = 10;
	int width = 6;
	int height = 8;
	boolean alive;
	int bType;
	double π = Math.PI;
	java.util.Random ran = new Random();
	double delta;
	GameStart gs;
	private BulletState bulletState;

	/**
	 * 
	 * @param alive
	 * @param gs
	 */
	public void BulletPlayer(boolean alive, GameStart gs) {
		// TODO - implement Bullet.BulletPlayer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param alive
	 * @param gs
	 * @param isGrape
	 */
	public void BulletPlayer(int x, int y, boolean alive, GameStart gs, int isGrape) {
		// TODO - implement Bullet.BulletPlayer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	public void drawMe(java.awt.Graphics g) {
		// TODO - implement Bullet.drawMe
		throw new UnsupportedOperationException();
	}

	public void move() {
		// TODO - implement Bullet.move
		throw new UnsupportedOperationException();
	}

	private void traceMove() {
		// TODO - implement Bullet.traceMove
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param d
	 */
	private double fabs(double d) {
		// TODO - implement Bullet.fabs
		throw new UnsupportedOperationException();
	}

	public java.awt.Rectangle getRectangle() {
		// TODO - implement Bullet.getRectangle
		throw new UnsupportedOperationException();
	}

}