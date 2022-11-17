abstract class Shape {
	abstract void perimeter(int a);
}
class Circle extends Shape {
	void perimeter(int radius) {
		System.out.println("Perimeter of the circle is = " +
				2 * 3.14 * radius);
	}
}
class Square extends Shape {
	void perimeter(int edge) {
		System.out.println("Perimeter of the square is = " +
				4 * edge);
	}
}
public class AbstractExample {
	public static void main(String [] args) {
		Circle c = new Circle();
		c.perimeter(4);
		Square sq = new Square();
		sq.perimeter(5);
	}
}
