package aug30;
interface Shape{
	void print();
	void show();
}

abstract class Circle implements Shape{
	 public void print() {
		System.out.println("This is a Circle");
	}
}

class  Rectangle extends Circle{
	public void show() {
		System.out.println("This is a rectangle");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		
		Shape obj = new Rectangle();
		obj.print();
		obj.show();
		// TODO Auto-generated method stub

	}

}
