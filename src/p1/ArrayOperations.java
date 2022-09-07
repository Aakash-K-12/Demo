package p1;

public class ArrayOperations {
	
		 public   int mini(int [] arr) {
			
			int min=arr[0];
			for(int i =0;i<arr.length;i++) {
				if(min>arr[i]) {
					min=arr[i];
				}
			}
			return min;
		}
		public int[] scale(int [] arr,int scale) {
			for( int i=0;i<arr.length;i++) {
				arr[i]=arr[i]*scale;
			}
			return arr;
			
		
		}

	}


