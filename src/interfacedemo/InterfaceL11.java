package interfacedemo;

public interface InterfaceL11 {
	default void m1()
	{
		System.out.println("InterfaceL11 m1 method");
	}
	static void m2()
	{
		System.out.println("static method");
	}
	

}
