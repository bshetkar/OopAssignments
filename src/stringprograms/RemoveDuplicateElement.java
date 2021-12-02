package stringprograms;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		String s = "bhaaahab";
		//char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					s = s.replaceFirst(s.charAt(i)+"", "");
				}
			}
		}
		System.out.println(s);

		/*
		 * String s = "hellollds"; // char[] ch = s.toCharArray(); for (int i = 0; i <
		 * s.length(); i++) { for (int j = i + 1; j < s.length(); j++) { if (s.charAt(i)
		 * != s.charAt(j)) { continue; } else { s = s.replaceFirst(s.charAt(i) + "",
		 * ""); } } } System.out.println("remove duplicate element from array:" + s);
		 */
	}

}
