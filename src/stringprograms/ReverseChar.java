package stringprograms;

public class ReverseChar {
	public static void main(String[] args) {
		String s = "DharmiK";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String temp = s1[i];
			char[] c = temp.toCharArray();
			char temp1 = c[0];
			c[0] = c[c.length - 1];
			c[c.length - 1] = temp1;
			System.out.print(c);
			System.out.println(" ");

		}

		/*
		 * String str = "DharmiK"; String[] s1 = str.split(" ");// hello for (int i = 0;
		 * i < s1.length; i++) { String temp = s1[i]; char[] c = temp.toCharArray();//
		 * h,e,l,l,o char temp1 = c[0]; c[0] = c[c.length - 1]; c[c.length - 1] = temp1;
		 * System.out.print(c); System.out.print(" ");
		 * 
		 * }
		 */
	}

}
