package stringprograms;

public class Pratice {
	public static void main(String[] args) {
		String s = "DharmiK";
		char temp;
		char[] c = s.toCharArray();
		temp = c[0];
		c[0] = c[c.length - 1];
		c[c.length - 1] = temp;
		System.out.println(c);

	}
	/*
	 * String s= "hello"; String s1="Hello"; if(s==s1) { System.out.println("same");
	 * }else System.out.println("different"); }
	 */

}
