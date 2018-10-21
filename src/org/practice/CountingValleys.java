package org.practice;

public class CountingValleys {

	public static void main(String[] args) {
		int n = 8;
        String s = "UDDDUDUU";
        
        n = 12;
        s = "DDUUDDUDUUUD";
        
        n = 10;
        s ="UDUUUDUDDD";
        
        int valleys = countingValleys(n, s);
        System.out.println("valleys = "+valleys);


	}
	
	static int countingValleys(int n, String s) {
		int result = 0;
		int step = 0;
		
		if(n <= 0 || s.isEmpty()){
			return result;
		}
		
		int u = 0;
		int d = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)== 'U'){
				step++;
				u++;
			}
			else{
				step--;
			}
			
			if(step ==0){
				result++;
			}
		}
		
		System.out.println("result = "+result);
		
		if(result%2 !=0){
			result = result/2+ result%2;
		} else if(){
		else{
			result = result/2;
		}
		return result;

    }

}
