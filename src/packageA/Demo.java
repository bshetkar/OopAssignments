package packageA;

public class Demo {
	public static void main(int a,int b) {
		System.out.println("this is first main method");
	}
	public static void main(Object[] args) {
		System.out.println("this is second main method");
	}
	public static void main(String a, String b) {
		System.out.println("this is three main method");
	}
	public static void main(char a, char b) {
		System.out.println("this is fourth main method");
	}
	public static void main(String[] args) {
		System.out.println("this is five main method");
		Demo.main("ahg", "blki");
		Demo.main('n', 'i');
		Demo.main(23, 76);
	}
}


