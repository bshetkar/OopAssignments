package stringprograms;

public class ReverseFirstCharToLast {
	public static void main(String[] args) {
		String s = "DharmiK";
		char c[] = s.toCharArray();
		char temp;
		temp = c[0];
		c[0] = c[c.length - 1];
		c[c.length - 1] = temp;
		System.out.println(c);
		/*
		 * char[] c = s.toCharArray(); System.out.println(c); char temp = c[0]; c[0] =
		 * c[c.length - 1]; c[c.length - 1] = temp; System.out.println(c);
		 */
	}
}
