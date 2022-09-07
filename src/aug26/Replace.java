package aug26;
import java.util.*;
public class Replace {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= (sc.next());
		
		System.out.println("Enter the substring to be replaced");
		String substr =(sc.next());
		if(str.contains(substr)) {
			System.out.println("Enter the string to be replaced");
			String replace=sc.next();
			String freplace=str.replace(substr, replace);
			System.out.println(freplace);
		}
		else {
			System.out.println(" Substring not found");
		}
		// TODO Auto-generated method stub

	}

}
