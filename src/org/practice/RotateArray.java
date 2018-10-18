package org.practice;

public class RotateArray {
	
	public static void main(String[] args) {
		int[] a = {2,8,9,1,7};
		int[] rotatedArray = new int[a.length];
		
		int no = 8;
		
		System.out.print("Given Array : ");
        for(int h : a){
            System.out.print(h+" ");
        }
        System.out.println("");
        
        rotatedArray = rotate(a,no);
        
        
	}

	private static int[] rotate(int[] a, int d) {
		int[] rotatedArray = new int[a.length];
		
        for (int i = 0; i < rotatedArray.length; i++) {
        	rotatedArray[i] = a[(i+d) % a.length];
		}
        
        System.out.print("[");
        for(int h : rotatedArray){
            System.out.print(h+" ");
        }
        System.out.println("]");
        return rotatedArray;
	}

}
