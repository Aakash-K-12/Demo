package aug26;
import java.util.*;
public class Merge {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string 1");
		StringBuilder str1= new StringBuilder(sc.next());
		
		System.out.println("Enter the string 2");
		StringBuilder str2 = new StringBuilder(sc.next());
		
		StringBuilder mergestr=new StringBuilder();
		
		for(int i=0;i<str1.length();i++) {
			if(Character.isUpperCase(str1.charAt(i))) {
				mergestr.append(str1.charAt(i));
			}
			
		}
		
		for(int i=0;i<str2.length();i++) {
			if(Character.isUpperCase(str2.charAt(i))) {
				mergestr.append(str2.charAt(i));
			}
			
		}
		
		System.out.println(mergestr);
		// TODO Auto-generated method stub

	}

}
