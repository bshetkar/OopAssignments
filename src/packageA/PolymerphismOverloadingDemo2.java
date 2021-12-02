package packageA;

public class PolymerphismOverloadingDemo2 {
	public void show(int a) {
		System.out.println("int method:");
	}
	public void show(String a)
	{
		System.out.println("string method:");
	}
	public static void main(String[] args) {
		PolymerphismOverloadingDemo2 t= new PolymerphismOverloadingDemo2();
		t.show('a');
		
	}

}
