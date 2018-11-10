package org.practice.generics;

class Printer <T> {

	public void printArray(T[] array) {
		//Arrays.asList(array).stream().forEach(i->System.out.print(i));   
		
		for (T t : array) {
			System.out.println(t);
		}
	}


}

public class Generics {
    
    public static void main(String args[]){
      
       
        Integer[] intArray = {1, 2, 3, 4, 5};

      
        String[] stringArray = {"a", "b", "c", "d", "e"};
       
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        int l = Printer.class.getDeclaredMethods().length;
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}