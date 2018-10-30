package org.practice.abstractexample;

import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
	
	int price;

	MyBook(String title, String author) {
		super(title, author);
	}
	
	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	@Override
	void display() {
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
		System.out.println("Price: "+this.price);
		
	}
}

// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
// End class

public class Solution {
	public static void main(String[] args) {
       
        String title = "The Alchemist";
        String author = "Paulo Coelho";
        int price = 248;

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
