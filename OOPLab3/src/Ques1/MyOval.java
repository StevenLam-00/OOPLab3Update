package Ques1;

import java.awt.Graphics;
//Khuu Khon Lam ITITIU18303

public class MyOval extends MyBoundedShape {

	private int width;
	private int height;
	final double pi = Math.PI;
	
	public MyOval(int width, int height) {
		super();
		this.height = height;
		this.width = width;
	}

	
	public void draw() {
		
		for (int i=1; i <= height; i++) {
			if ( i == 1 || i == height) {
				for ( int j=1; j <= width; j++) {
					if ( j != 1 && j != 2 && j != width && j!= width-1 ) {
						System.out.print("*");
					}
					else {
						System.out.println(" ");
					}
					System.out.println("");
				}
			}
			
			if ( i == 2 || i == height-1) {
				for ( int j=1; j <= width; j++) {
					if ( j == 2 || j == width -1 ) {
						System.out.print("*");
					}
					else {
						System.out.println(" ");
					}
					System.out.println("");
				}
			}
			
			if ( i >= 3 && i == height-2) {
				for ( int j=1; j <= width; j++) {
					if ( j == 1 || j == width ) {
						System.out.print("*");
					}
					else {
						System.out.println(" ");
					}
					System.out.println("");
				}
			}
			
			
		}
		
	}
	
	public void draw( Graphics g, int x, int y) {
		g.drawOval(x, y, width, height);
	}
	@Override
	public double GetArea() {
		// TODO Auto-generated method stub
		return pi*width*height;
	}
}
