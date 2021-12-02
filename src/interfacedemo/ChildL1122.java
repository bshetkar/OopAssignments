package interfacedemo;

public class ChildL1122 implements InterfaceL11,InterfaceL22 {

	@Override
	public void m1() {
		
		InterfaceL11.super.m1();
		InterfaceL22.super.m1();
	}
	public static void main(String[] args) {
		InterfaceL11 c= new ChildL1122();
		//ChildL1122 c= new ChildL1122();
        c.m1();
	}

}
