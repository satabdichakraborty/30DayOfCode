package org.practice.stackqueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksNQueues {
	
	Stack<Character> stacky = null;
	Queue<Character> queuey = null;
	
	StacksNQueues(){
		stacky = new Stack<>();
		queuey = new LinkedList<>();
	}
	
	private void enqueueCharacter(char c) {
		this.queuey.add(c);
		
	}
	
	private Object dequeueCharacter() {
		return this.queuey.remove();
	}
	

	private Object popCharacter() {
		return this.stacky.pop();
	}

	private void pushCharacter(char c) {
		this.stacky.push(c);
		
	}

    public static void main(String[] args) {
       
        String input = "racecar";
       

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StacksNQueues p = new StacksNQueues();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
	
}