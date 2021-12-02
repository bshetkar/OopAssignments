package stringprograms;

public class ReverseStringWithoutChagingSpecialCharater1 {
	public static void main(String[] args) {
		String s = "bha$gy@a&shr!ee";
		char[] c = s.toCharArray();
		char temp;
		for (int i = 0, j = c.length - 1; i < j;) {
			if (!Character.isAlphabetic(c[i])) {
				i++;
			} else if (!Character.isAlphabetic(c[j])) {
				j--;
			} else {
				temp = c[i];
				c[i]=c[j];
				c[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(c);
	}
}
