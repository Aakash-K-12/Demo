package sample;
import java.util.*;
public class minmax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int n =sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] );
		System.out.println(arr[n-1] );
		// TODO Auto-generated method stub

	}

}
