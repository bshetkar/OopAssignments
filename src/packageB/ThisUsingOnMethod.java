package packageB;

/*
 * This keyword can be used to invoke current class method.
 * This keyword  can be used to pass as an argument in method call.
 * This keyword  can be used to pass as an argument in constructor call.
 * This keyword  can be used to return the current class instance from the method.
 */
public class ThisUsingOnMethod {
	public void display() {
		System.out.println("hello");

	}

	public void show() {
		// display(this);
		this.display();// u can write display();

	}

	public static void main(String[] args) {
		ThisUsingOnMethod t = new ThisUsingOnMethod();
		t.show();
	}

}
