package sept1;

import java.util.*;

public class CollectionsTest {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		// System.out.println("enter the size of the arraylist");
		// int n= sc.nextInt();
		// System.out.println("enter the elements of the arraylist");
		// for(int i=0;i<n;i++) {
		// a.add(sc.next());
		// }
		// System.out.println(a);

		while (true) {
			System.out.println("Enter the choice");
			System.out.println("1: Insertion \n 2: Deletion \n 3: Print");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element to be inserted");
				a.add(sc.next());
				System.out.println("element added ");
				break;
			case 2:
				System.out.println("Enter the position to be deleted");
				a.remove(sc.nextInt());
				System.out.println("Element deleted");
				break;
			case 3:
				System.out.println(a);
				break;
			case 4:
				return;
			}
		}
		// TODO Auto-generated method stub

	}

}
