package packageA;

public class CopyConstructorDemo {
	int id;
	String name;

	public CopyConstructorDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public CopyConstructorDemo(CopyConstructorDemo s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		CopyConstructorDemo s1 = new CopyConstructorDemo(23, "sagar");
		CopyConstructorDemo s2 = new CopyConstructorDemo(s1);
		s1.display();
		s2.display();

	}

}
