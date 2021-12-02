package packageB;

public class UsingThisKeyword {
	/*
	 * This keyword is used to invoke current class instance variable
	 */
	int i;

	public void display(int i) {
		this.i = i;
	}

	public void show() {
		System.out.println(i);

	}

	public static void main(String[] args) {
		UsingThisKeyword s = new UsingThisKeyword();
		s.display(10);
		s.show();

	}

}




