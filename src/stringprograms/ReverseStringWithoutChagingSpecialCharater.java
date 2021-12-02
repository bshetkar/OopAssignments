package stringprograms;

public class ReverseStringWithoutChagingSpecialCharater {
	public static void main(String[] args) {
		int count=0;
		String s = "ra%j$ni";
	    char[] c = s.toCharArray();
		String rev = " ";
		for (int i = c.length; i >= 0; i--) {
			//if (s.charAt(i)=='$'|| s.charAt(i)=='&' || s.charAt(i)=='#' || s.charAt(i)=='%') {
			if(!Character.isDigit(c[i])) {
				rev = rev + s.charAt(count);
				count--;
			} else {
				rev = rev + s.charAt(i);
				count++;
	
			}
		}
		System.out.println(c);
	}
}