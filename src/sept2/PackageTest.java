package sept2;
import  p1.*;
import java.util.*;
public class PackageTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		ArrayOperations ap=new ArrayOperations();
		
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
		
		int [] array = new int[n];
		
		System.out.println("Enter the element of the array");
		
		for (int i =0 ;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		while(true) {
			System.out.println("Enter the operation to be performed");
			System.out.println("1:Minimum element of the array \n2:Scale the array \n3:Display \n4:Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: int minimum= ap.mini(array);
					System.out.println("The minimum element in the array is "+minimum);
					
				break;
				
			case 2: System.out.println("Enter the scale factor");
					int sf=sc.nextInt();
					array=ap.scale(array,sf);
					System.out.println("Scaling operation done ");
					
				break;
				
			case 3: System.out.println(" The array elements are");
					for(int i=0;i<n;i++) {
					System.out.println(array[i]);
					}
				break;
			case 4:return;
			}
		}
		// TODO Auto-generated method stub

	}

}
