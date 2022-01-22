package edu.java.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileMain {

	public static void main(String[] args) {
		// while 반복문
		int x = 2;
		while (x <= 20) {
			System.out.print(x + ", ");
			x += 2;
		}
		System.out.println();
		
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(i * 3);
		}
		System.out.println(numbers);
		
		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		System.out.println();
		
		List<String> names = new ArrayList<>();
		names.add("Java");
		names.add("JavaScript");
		names.add("Python");
		System.out.println(names);
		
		Iterator<String> itr2 = names.iterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + ", ");
		}
		System.out.println();
		
	}

}
