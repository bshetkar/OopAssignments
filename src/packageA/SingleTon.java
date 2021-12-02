package packageA;

/**
 * 
 * This is singleton class.please use getInstance() method to create an object
 *
 */
public class SingleTon {
	private static SingleTon s;
	static {
		s = new SingleTon();
	}

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		return s;
	}
}
