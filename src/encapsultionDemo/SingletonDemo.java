package encapsultionDemo;

public class SingletonDemo {
	public static void main(String[] args) {
		EncapsultionMethodUsingSingleton e = EncapsultionMethodUsingSingleton.getInstance();
		e.setEmpname("bhagu");
		System.out.println("print the name:" + e.getEmpname());

	}

}
