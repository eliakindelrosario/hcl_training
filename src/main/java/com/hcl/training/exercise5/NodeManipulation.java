package com.hcl.training.exercise5;

import java.util.LinkedList;

public class NodeManipulation {

	public static void main(String[] args) {
		// Init List
		LinkedList<String> items = new LinkedList<String>();

		for (int i = 0; i < 5; i++) {
			items.add("Item " + i);
		}

		// Features
		System.out.println("Original List: \n\t" + items);
		System.out.println();

		// Add at the top
		items.addFirst("First");
		System.out.println("Add to the top: ");
		System.out.println("\t" + items);
		System.out.println();

		// Add at the end
		items.addLast("Last");
		System.out.println("Add to the end: ");
		System.out.println("\t" + items);
		System.out.println();

		// Get top
		String item1 = items.getFirst();
		System.out.println("Get First ");
		System.out.println("\t" + items);
		System.out.println(item1);
		System.out.println();

		// Get end
		String item2 = items.getLast();
		System.out.println("Get Last ");
		System.out.println("\t" + items);
		System.out.println(item2);
		System.out.println();

		items.removeFirst();
		System.out.println("Remove First ");
		System.out.println("\t" + items);
		System.out.println();

	}

}
