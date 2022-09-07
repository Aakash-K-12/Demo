package sample;

import java.util.*;

public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int n =sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		
		
		/*
		for(int i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
		} */
		
		
		int m=n;
		for(int i=0;i<m;i++) {
			int temp=arr[i];
			arr[i]=arr[m-1];
			arr[m-1]=temp;
			m--;
		} 
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
