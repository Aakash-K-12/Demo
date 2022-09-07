package aug26;
import java.util.*;
public class DeleteChars {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		StringBuilder str =new  StringBuilder(sc.next());
		System.out.println("Enter the position to be deleted");
		int p=sc.nextInt();
		if(p> str.length() || p<0) {
			System.out.println("Index out of range");
		}
		else
			System.out.println("String after deleting at index "+p+" is "+str.deleteCharAt(p));
			
		}
}
		// TODO Auto-generated method stub

	

