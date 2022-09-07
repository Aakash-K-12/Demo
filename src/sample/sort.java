package sample;

import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int n =sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
