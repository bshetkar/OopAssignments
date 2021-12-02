package stringprograms;

import java.util.HashMap;

public class CountTheNoOfStringUsingHashmap {
	public static void main(String[] args) {
		String s = "this this is is done by sanket sanket";
		String s1[] = s.split(" ");
		int count = 1;
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		for (int i = 0; i < s1.length; i++) {

			if (h.containsKey(s1[i])) {
				//count = h.get(s1[i]);
				h.put(s1[i], count + 1);
				// count++;
			} else {
				h.put(s1[i], 1);
			}
		}
		System.out.println(h);
	}

}
