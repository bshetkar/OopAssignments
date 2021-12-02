package stringprograms;

import java.util.Arrays;

public class CountOccouranceOfEachCharacter {

	public static void main(String[] args) {
		String s = "yedya";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		int count = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
			} else {
				count += 1;
				System.out.println("Occurence " + c[i] + " " + count);
				count = 0;
			}
		}
	}
}
