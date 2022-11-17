package com.epam.corejava.wildcard;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    public abstract void draw(Canvas c);
}

class Circle extends Shape {
    private int radius;
    Circle(int radius) {
    	this.radius = radius;
    }
    public void draw(Canvas c) {
    	System.out.println("Drawing circle.");
    	System.out.println("Radius : " + radius);
    }
}
class Rectangle extends Shape {
    private int width, height;
    
    public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw(Canvas c) {
        System.out.println("Drawing rectangle.");
        System.out.println("Width : " + width + " Height : " + height);
    }
}
class Canvas {
    public void draw(Shape s) {
        s.draw(this);
   }
   public void drawAll(List<? extends Shape> shapes) {
	   for(Shape s : shapes) {
		   s.draw(this);
	   }
   }
   public void drawShapes(List<Shape> shapes) {
	   for(Shape s : shapes) {
		   s.draw(this);
	   }
   }
}

public class WildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Rectangle(2, 3));
		shapes.add(new Circle(1));
		Canvas canvas = new Canvas();
		canvas.drawAll(shapes);
		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle(3, 5));
		rectangles.add(new Rectangle(1, 2));
		rectangles.add(new Rectangle(5, 9));
//		canvas.drawShapes(rectangles);
		canvas.drawAll(rectangles);
	}

}
