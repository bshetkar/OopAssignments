package stringprograms;

public class RemoveSpaceWithoutUsingReplaceMethod {

	public static void main(String[] args) {
		String s = "ma ma ma";
		char[] c = s.toCharArray();
		String s1 = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				continue;
			} else {
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
