package stringprograms;

public class GivenStringRemoveInt {
	public static void main(String[] args) {
		String s = "He110 Te5t7n9 5hastra";
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				System.out.println((s.charAt(i)-48));
				//result = result + (s.charAt(i)-48);
			}
		}
		//System.out.println(result);

		/*
		 * for (int i = 0; i < s.length(); i++) { if (Character.isDigit(s.charAt(i))) {
		 * result = result + Character.getNumericValue(s.charAt(i)); } }
		 * System.out.println("print total number of addition:" + result);
		 */
	}

}
