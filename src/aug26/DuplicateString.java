package aug26;
import java.util.*;

class Duplicate{
	String s;
	void dup(String str) {
		String [] strarray =str.split(" ");
		int flag=0;
		//System.out.println(strarray[0]);
		for( int i =0; i<strarray.length;i++) {
			for(int j =i+1;j<strarray.length;j++){
				if(strarray[i].equals(strarray[j]) ){
					flag++;
					strarray[j]="0";				}
			}
			if(strarray[i]!="0" && flag>0) {
				System.out.println(strarray[i]);
			}
			
			}
		if(flag==0)
			System.out.println("No duplicates");
			
		
			
		
	}
}
public class DuplicateString {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String  s= sc.nextLine();
		Duplicate d = new Duplicate();
		d.dup(s);
		// TODO Auto-generated method stub

	}

}
