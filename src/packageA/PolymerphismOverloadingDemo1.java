package packageA;

public class PolymerphismOverloadingDemo1 {
	public void show(int a, String b)
	{
		System.out.println("1");
	}
	public void show(String a, int b)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		PolymerphismOverloadingDemo1 p= new PolymerphismOverloadingDemo1();
				p.show("abc", 1);
	}

}
