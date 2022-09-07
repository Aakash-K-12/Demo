package sept1;

class MyException extends Exception { // User-defined exception
	MyException(String s) {
		super(s);
	}
}

public class ExampleException {

	static void divide(int a, int b) {
		/*
		 * try { int c=a/b; } catch(ArithmeticException e){
		 * System.out.println(" Exception Caught"); } finally {
		 * System.out.println(" Finally block"); }
		 */
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		try {
			divide(5, 0);
			throw new MyException("My Exception");
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("outside catch");
		// TODO Auto-generated method stub

	}

}
