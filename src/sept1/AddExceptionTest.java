package sept1;

import java.util.*;

class AddException extends Exception {
	AddException(String s) {
		System.out.println(s);
	}
}

public class AddExceptionTest {
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = add(num1, num2);
		if (res >= 100) {
			try {
				throw new AddException("Exception:: Sum is greater than 100");
			} catch (AddException a) {
				// System.out.println(" Exception handled");
			}
		} else {
			System.out.println("Sum is " + res);
		}

		// TODO Auto-generated method stub

	}

}
