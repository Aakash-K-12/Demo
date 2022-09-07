package sample;

public class conditions {

	public static void main(String[] args) {
		int x = 50;
		int y = 100;
		if(x > y) {
			System.out.println(" X is greater");
		}else if(x==y) {
			System.out.println("  Equals");
		}else {
			System.out.println(" y is greater");
		}
		int i= 0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(); 
		
		int j=0;
		do {
			
			System.out.println(j);
			j++;
		}while(j<10);
		
		int n=5;
		System.out.println();
		int[] arr = new int[] {12,6,8,9,0};
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String [] str = {"abc","xyz"};
		for( String  s :str ) {
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}

}
