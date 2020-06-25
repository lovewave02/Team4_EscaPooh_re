package com.escapooh.game.bee;

import java.awt.Image;

public class Slingshot extends Bullet{
	
	public BeeRun run;
	
	public Slingshot(BeeRun run, Image image, int x, int y) {
		super(run, image, x, y);
		dx = 0;
		dy = 0;
	}
	@Override
	public void move() {
		if((dx < 0) && (x < 10)) {
			return;
		}
		if((dy > 0) && (x > 800)) {
			return;
	}
	super.move();
	}
	
	@Override
	public void handleCollision(Crush other){
		if(other instanceof Bee) {
			run.endGame();
		}
		
	}


}