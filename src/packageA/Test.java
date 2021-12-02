package packageA;

public class Test {
	public static void main(String[] args) {
		SingleTon s = SingleTon.getInstance();
		SingleTon s1 = SingleTon.getInstance();
		if (s == s1) {
			System.out.println("address Equal:");
		} else {
			System.out.println("address are not equal:");
		}
	}

}
