package com.game;

import java.awt.*;
import java.util.*;

public class GameStart extends Frame {

	Background gs;
	int count = 0;
	int num = 0;
	int score = 0;
	int bossTime = 5;
	int level = 1;
	boolean isOver = false;
	java.util.Random ran = new Random();
	java.awt.Toolkit toolkit = Toolkit.getDefaultToolkit();
	Plane plane = new Plane(250, 500, false, this);
	Boss boss = new Boss(30, 50, this, true);
	Collection<Enemy> enemies = new ArrayList<Enemy>();
	public Collection<BulletEm> be = new ArrayList<BulletEm>();
	Collection<Explode> explodes = new ArrayList<Explode>();
	Collection<Food> foods = new ArrayList<Food>();
	private Background bg = newBackground(this);

	public GameStart() {
		// TODO - implement GameStart.GameStart
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	@Override
	public void update(java.awt.Graphics g) {
		// TODO - implement GameStart.update
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ui
	 */
	public void SetUp(GUISetUp ui) {
		// TODO - implement GameStart.SetUp
		throw new UnsupportedOperationException();
	}

	public int getScore() {
		return this.score;
	}

	public void initView() {
		// TODO - implement GameStart.initView
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	@Override
	public void paint(java.awt.Graphics g) {
		// TODO - implement GameStart.paint
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO - implement GameStart.main
		throw new UnsupportedOperationException();
	}


	class MyThread extends Thread {

		@Override
		public void run() {
			// TODO - implement MyThread.run
			throw new UnsupportedOperationException();
		}

	}

}