package sample;
import java.util.*;

public class duplicate {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int n =sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		/*
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
		} */
		
		
		Set<Integer> unique = new HashSet<>();
	    Set<Integer> duplicate = new HashSet<>();

	    for (int val : arr)
	        if (!unique.add(val))
	            duplicate.add(val);
	    for( int i : duplicate) {
	    	System.out.println(i);
	    }
		
		}
		// TODO Auto-generated method stub

	}


