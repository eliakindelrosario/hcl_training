package com.hcl.training.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringManipulationDriver {

	public static void main(String[] args) {

		// Replace _ with :
		String name1 = "John_Miller_Doe";
		System.out.println("Replacing _ with :");
		System.out.println("\tOriginal: " + name1);
		name1 = name1.replace('_', ':');
		System.out.println("\tModified: " + name1);
		System.out.println();

		// Replace _ with space
		String name = "John_Miller_Doe";
		System.out.println("Replacing _ with ");
		System.out.println("\tOriginal: " + name);
		name = name.replace('_', ' ');
		System.out.println("\tModified: " + name);
		System.out.println();

		// embed trivial data with StringBuilder
		StringBuilder sb = new StringBuilder(name);
		System.out.println("Embedding trivial data");
		System.out.println("\tOriginal: " + name);
		sb.append(" trivial data");
		System.out.println("\tModified: " + sb);
		System.out.println();

		// Split date using Tokenizer
		String date = "2/3/2022";
		List<String> tokens = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(date, "/");
		while (tokenizer.hasMoreElements()) {
			tokens.add(tokenizer.nextToken());
		}
		System.out.println("Split Date from dd/mm/yyyy individually");
		System.out.println("\tOriginal: " + date);
		System.out.println("\tDay: " + tokens.get(0));
		System.out.println("\tMonth: " + tokens.get(1));
		System.out.println("\tYear: " + tokens.get(2));

	}

}
