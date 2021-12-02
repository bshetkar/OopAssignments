package interfacedemo;

public interface InterfaceL1 {
	// by default all variable are public static final.
	// since java 9 default & static method have body interface.
	// After 9th version Interface inheritance concept is satisfied.
	public void m1();

	public void m2();

	default void m3() {
		System.out.println("default method:");
	}

}
