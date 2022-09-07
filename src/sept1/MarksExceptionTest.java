package sept1;

import java.util.*;

class MarksException extends Exception {
	MarksException(String s) {
		super(s);
	}
}

public class MarksExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter internal marks");
		int internalMarks = sc.nextInt();

		/*
		 * if(internalMarks >40) { try { throw new
		 * MarksException(" Internal Marks is greater than 40"); } catch(MarksException
		 * m) { System.out.println(""); } } else {
		 * System.out.println(" Enter external Marks"); int externalMarks= sc.nextInt();
		 * 
		 * 
		 * if(externalMarks >60) { try { throw new
		 * MarksException(" External Marks is greater than 60"); } catch(MarksException
		 * m) { System.out.println(""); } } else {
		 * System.out.println(" Internal marks : "+internalMarks);
		 * System.out.println(" Internal marks : "+externalMarks); }
		 * 
		 * }
		 */

		try {
			if (internalMarks > 40) {
				throw new MarksException("Marks greater than 40");
			}
			System.out.println(" Enter external Marks");
			int externalMarks = sc.nextInt();
			if (externalMarks > 60) {
				throw new MarksException("Marks greater than 60");
			}
			System.out.println("Internal Marks : " + internalMarks + " External Marks : " + externalMarks);
		} catch (MarksException a) {
			System.out.println(a);
		}

		// TODO Auto-generated method stub

	}

}
