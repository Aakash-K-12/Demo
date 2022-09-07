package aug29;

import java.util.*;

class Rectangle {
	double width;
	double height;

	Rectangle() {

	}

	Rectangle(double a, double b) {
		width = a;
		height = b;

	}

	double getArea() {

		return width * height;
	}

	void maxArea(Rectangle[] a) {
		double maxArea = 0.0;
		int flag = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i].getArea() > maxArea) {
				maxArea = a[i].getArea();
				flag = i;
			}

		}
		System.out.println("Maximum area :" + maxArea);
		System.out.println("width :" + a[flag].width + " height : " + a[flag].height);
	}

	void minArea(Rectangle[] a) {
		double minArea = a[0].getArea();
		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].getArea() < minArea) {
				minArea = a[i].getArea();
				flag = i;
			}

		}
		System.out.println("  Minimun Area :" + minArea);
		System.out.println("width :" + a[flag].width + " height : " + a[flag].height);
	}

}

public class Rect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Rectangle instances");
		int n = sc.nextInt();
		Rectangle[] r = new Rectangle[n];
		Rectangle rec = new Rectangle();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the width and height of " + (i + 1) + " instance");
			double w = sc.nextDouble();
			double h = sc.nextDouble();
			r[i] = new Rectangle(w, h);
		}

		rec.maxArea(r);
		rec.minArea(r);

		// TODO Auto-generated method stub

	}

}
