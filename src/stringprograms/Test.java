package stringprograms;

public class Test {
	public static void main(String[] args) {
		String s = "hello testing sharstra";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			for (int j = s1[i].length() - 1; j >= 0; j--) {
				char c = s1[i].charAt(j);
				String t=Character.toString(c);
				System.out.print(t);
			}
            System.out.print(" ");
		}

	}
}