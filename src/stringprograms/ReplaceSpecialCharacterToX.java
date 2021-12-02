package stringprograms;

public class ReplaceSpecialCharacterToX {
	public static void main(String[] args) {
		String s = "Te$!ng $h@str@";
		for (int i = 0; i < s.length(); i++) {
			// if (s.charAt(i) == '$' || s.charAt(i) == '!' || s.charAt(i) == '$' ||
			// s.charAt(i) == '@') {
			/* s = s.replaceAll("[^a-z A-Z 0-9]", "x"); */
			s = s.replaceAll("[^a-z,A-Z,0-9]", "x");
		}

		System.out.println(s);
	}
}
