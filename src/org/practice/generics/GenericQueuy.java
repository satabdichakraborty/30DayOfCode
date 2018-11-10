package org.practice.generics;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueuy<D> {

	Queue<D> queuey;
	
	public GenericQueuy(){
		queuey = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		
		GenericQueuy gq = new GenericQueuy();
		gq.pop();
	}

	private void pop() {
		queuey.poll();
	}
	
	

}
