package interfacedemo;

public class ParentL implements InterfaceL1{

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 metod");
		
	}
	public static void main(String[] args) {
		InterfaceL1 i= new ParentL();
		i.m3();
		
	}

}
