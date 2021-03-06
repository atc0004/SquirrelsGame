package framework;

import SquirrelsGame.Game;

public class Camera {
	private int width, height;
	private float x, y;

	public Camera(float x, float y) {
		this.x = x;
		this.y = y;
		this.width = Game.WIDTH;
		this.height = Game.HEIGHT;
	}

	public void tick(GameObject o) {
		x += ((o.getX() - x) - width / 2) * 0.05f;
		y += ((o.getY() - y) - height / 2) * 0.05f;
		if (x <= 0)
			x = 0;
		if (x >= width + 48)
			x = width + 48;
		if (y <= 0)
			y = 0;
		if (y >= height + 48)
			y = height + 48;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

}
