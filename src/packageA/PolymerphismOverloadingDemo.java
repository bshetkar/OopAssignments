package packageA;

public class PolymerphismOverloadingDemo {
	public void add(int x,int y) {
	System.out.println("addition of two numbers:");
	}
	private void add(int a, int b,int c) {
	System.out.println("addition of three number:");
	}
	public static void main(String[] args) {
		PolymerphismOverloadingDemo p=new PolymerphismOverloadingDemo();
		p.add(2, 4, 9);
		
	}

}
