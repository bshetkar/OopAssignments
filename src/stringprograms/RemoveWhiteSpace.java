package stringprograms;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String s = "hello shetkar      bhagyashree";
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);

		/*
		 * String s = " hello bhagyashree    shetkar"; String s1 = s.replaceAll("\\s",
		 * ""); System.out.println(s1);
		 */
	}
}
