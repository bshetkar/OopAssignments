package stringprograms;

public class NonRepeatingCharcter {
	public void nonRepatingchar(String s) {
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == (s.charAt(j)) && i != j) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println("print non repeating String:" + count);
			} else {
				System.out.println("there is no non repeating charcter:");
			}
		
		}
	}

}
