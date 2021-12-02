package stringprograms;

public class RemoveIntFromString {

	public static void main(String[] args) {
		String s = "bhag34u98";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				System.out.println(s.charAt(i) - 48);
			}
		}

	}

}
