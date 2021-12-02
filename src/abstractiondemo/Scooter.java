package abstractiondemo;

public class Scooter extends Vehicle {

	@Override
	public void Start() {
		System.out.println("start with kick:");
	}

	@Override
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Scooter s = new Scooter();
		System.out.println(s.add(4, 9));
	}
}
