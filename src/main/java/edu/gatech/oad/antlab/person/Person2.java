package edu.gatech.oad.antlab.person;

import java.util.Random;

/**
 * A simple class for person 2
 * returns their name and a
 * modified string
 *
 * @author Faisal Gedi
 * @version 1.1
 */
public class Person2 {
	/**
	 * Holds the persons real name
	 */
	private String name;

	/**
	 * The constructor, takes in the persons
	 * name
	 *
	 * @param pname the person's real name
	 */
	public Person2(String pname) {
		name = pname;
	}

	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		//Person 2 put your implementation here
		Random random = new Random();
		String jumble = scramble(random, input);

		return jumble;
	}

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 * object
	 */
	public String toString(String input) {
		return name + calc(input);
	}


	public static String scramble(Random random, String inputString) {
		// Convert your string into a simple char array:
		char a[] = inputString.toCharArray();

		// Scramble the letters using the standard Fisher-Yates shuffle,
		for (int i = 0; i < a.length - 1; i++) {
			int j = random.nextInt(a.length - 1);
			// Swap letters
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		return new String(a);
	}

}
