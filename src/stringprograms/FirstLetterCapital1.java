package stringprograms;

public class FirstLetterCapital1 {
	public static void main(String[] args) {

		String s = "hello janu";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String s1 = str[0] + " " + str[1];
			System.out.println(s1);
		}

	}

}
