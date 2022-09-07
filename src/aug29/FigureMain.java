package aug29;

import java.util.*;

abstract class Figure {
	double dimension1, dimension2;

	abstract void area();
}

class Rectangl extends Figure {
	Rectangl(double a, double b) {
		dimension1 = a;
		dimension2 = b;
	}

	void area() {
		System.out.println("Area of Rectangle " + dimension1 * dimension2);
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		dimension1 = a;
		dimension2 = b;
	}

	void area() {
		System.out.println("Area of Triangle " + 0.5*dimension1 * dimension2);
	}
}

class Square extends Figure {
	Square(double a) {
		dimension1 = a;
	}

	void area() {
		System.out.println("Area of Square " + dimension1 * dimension1);
	}
}

public class FigureMain {

	public static void main(String[] args) {

		Figure a = new Rectangl(2, 3);
		a.area();
		Figure b = new Triangle(6, 8);
		b.area();
		Figure c = new Square(8);
		c.area();
		// TODO Auto-generated method stub

	}

}
