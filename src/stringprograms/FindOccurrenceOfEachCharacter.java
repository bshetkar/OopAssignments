package stringprograms;

public class FindOccurrenceOfEachCharacter {
	public static void main(String[] args) {
		String s = "Bhagyashree";
		int visited = -1;
		int[] str = new int[s.length()];
		// String[] s1 = s.split("");
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				char b = s.charAt(j);
				if (a == b) {
					count++;
					str[j] = visited;

				}
			}
			if (str[i] != visited) {
				str[i] = count;
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != visited) {
				System.out.println(" " + s.charAt(i) + " " + str[i]);
			}
		}
	}
}
