package stringprograms;

public class FirstLetterCaptital {
	public static void main(String[] args) {
		String s = "bhagu";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String temp = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
			System.out.println(temp);
		}
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * String s = "testing sharstra"; String[] str = s.split(" "); for (int i = 0; i
		 * < str.length; i++) { String temp =
		 * str[i].substring(0,1).toUpperCase()+str[i].substring(1);
		 * System.out.print(temp);
		 * 
		 * }
		 */
	}
}