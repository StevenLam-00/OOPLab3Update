package Ques1;

import java.awt.Graphics;
//Khuu Khon Lam ITITIU18303

public class MyRectangle extends MyBoundedShape {

	private int width;
	private int height;

	public MyRectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double GetArea() {		
		return width*height;
	}

	public void draw(Graphics g, int x, int y) {
		g.drawRect(x, y, width, height);
	}
	
}
