package Ques1;
import java.awt.Graphics;
//Khuu Khon Lam ITITIU18303

public class MyLine extends MyShape{
	private int length;

	public MyLine(int length) {
		super();
		this.length = length;
	}
	

	@Override
	public void draw() {
		for (int i = 1; i <= length ; i++) {
			System.out.println("*");
		}
		System.out.println();
	}
	
	public void draw (Graphics g, int x1, int y1, int y2, int x2) {
		g.drawLine(x1, y1, x2, y2);
	}
	
}
