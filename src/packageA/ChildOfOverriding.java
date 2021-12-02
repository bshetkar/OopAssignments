package packageA;

public class ChildOfOverriding extends ParentOfOverriding {
	@Override
	public int add(int a, int b) {
		System.out.println("Child class add method:");
		return a+b;
	}
	public static void main(String[] args) {
		ParentOfOverriding p= new ChildOfOverriding();
		p.add(9, 54);
		ParentOfOverriding c= new ParentOfOverriding();
		c.add(5, 9);
	}

}
