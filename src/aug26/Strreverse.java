package aug26;
import java.util.*;
import java.lang.*;

class Reverse{
	StringBuilder rev(StringBuilder s) {
			return s.reverse();
		}
}

public class Strreverse {

	public static void main(String[] args) {
		
		Reverse str = new Reverse();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to be reversed");
		StringBuilder s = new StringBuilder(sc.next());
		System.out.println(str.rev(s));
		
		
		
		// TODO Auto-generated method stub

	}

}
