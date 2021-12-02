package stringprograms;

public class CountNumberOfCharacterPresntInGivenString {
	public static void main(String[] args) {
		String s = "janu pillu";
		int counter = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) >= '0' || s.charAt(i) <= '9') {
				counter++;
			}
		}
		System.out.println("total no of counter:" + counter);
		/*
		 * char[] c = s.toCharArray(); for (int i = 0; i < c.length; i++) { if (c[i] >=
		 * '0' || c[i] <= '9') { counter++; } } System.out.println("total no of counter"
		 * + counter);
		 */
	}

}
