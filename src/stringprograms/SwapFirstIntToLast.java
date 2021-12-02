package stringprograms;

public class SwapFirstIntToLast {
	public static void main(String[] args) {
		int num = 1234;
		int rem;
		int rev = 0;

		while (num > 0) {
			rem = num % 10;//4,2,3,1
			num = num / 10;
			rev = rev * 10 + rem;
			System.out.println(rev);

		}

	}
}