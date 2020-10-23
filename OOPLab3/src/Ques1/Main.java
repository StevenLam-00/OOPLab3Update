package Ques1;
//Khuu Khon Lam ITITIU18303
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main extends Canvas {
	static int width=0, width2=0, height=0, height2=0, length=0 ;  
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("input lenght of a line");
		length=sc.nextInt();
		System.out.print("input width for rectangle 1 and oval 1: ");
		width= sc.nextInt();
		System.out.print("input height for rectangle 1 and oval 1: ");
		height= sc.nextInt();
		
		System.out.print("input width for rectangle2 and oval 2: ");
		width2= sc.nextInt();
		System.out.print("input height for rectangle 2 and oval 2: ");
		height2= sc.nextInt();
		
		Main m = new Main();
		JFrame f = new JFrame();
			f.add(m);
			f.setSize(400,400);
			f.setVisible(true);
		}
	public void paint(Graphics g) {
		MyRectangle rectangle= new MyRectangle(width, height);
		rectangle.draw(g,25,100);
		System.out.println("Area of rectangle 1: "+rectangle.GetArea());
		MyRectangle rectangle2= new MyRectangle(width2, height2);
		rectangle2.draw(g,100,100);
		System.out.println("Area of rectangle 2: "+rectangle2.GetArea());
		MyLine line =new MyLine(length);
		line.draw(g,0,25,25,length);
		
		MyOval oval = new MyOval(width, height) ;
		oval.draw(g,25,200);
		System.out.println("Area of oval 1: "+oval.GetArea());
		MyOval oval2 = new MyOval(width2, height2) ;
		oval2.draw(g,100,200);
		System.out.println("Area of oval 2: "+oval2.GetArea());

	}
}