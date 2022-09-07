package aug26;
import java.util.*;


public class Substring {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		System.out.println("Enter the substring");
		String substr = sc.next();
		if(str.contains(substr)) {
			System.out.println("Substring found");
		}
		else {
			System.out.println("substring not found");
		}
		// TODO Auto-generated method stub

	}

}
