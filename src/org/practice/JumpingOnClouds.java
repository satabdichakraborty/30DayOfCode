package org.practice;

public class JumpingOnClouds {

	public static void main(String[] args) {
		 // 4
		 int[] c = {0, 0, 1, 0, 0, 1, 0};
		 
		 //3
		 int[] c1 = {0, 0, 0, 0, 1, 0};
		 
		 //3
		 int[] c2 = {0, 0, 0, 1, 0, 0};
		 
		 int result = jumpingOnClouds(c);
		 System.out.println(result);

	}

	private static int jumpingOnClouds(int[] c) {
		
		int jumps = 0;
		int index=0;
		int i=0;
		if(c.length ==2){
			return 1;
		}
		while (i < c.length-2) {
			if( (c[i+1] == 0) && (c[i+2] == 0)){
				index = index+2;
				jumps++;
			}
			else if ( (c[i+1] == 1) && (c[i+2] == 0)){
				index = index+2;
				jumps++;
			}
			else if ( (c[i+1] == 0) && (c[i+2] == 1)){
				index = index+1;
				jumps++;
			}
			i= index;
			
			if(i == c.length-2){
				jumps++;
			}
		}
		
		return jumps;
	}

}
