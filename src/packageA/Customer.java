package packageA;

public class Customer {
	String aadhar, pan;

	public Customer(String aadhar, String pan) {
		this.aadhar = aadhar;
		this.pan = pan;
		System.out.println("hi");

	}

	public static void main(String[] args) {
		Customer c = new Customer("ABGHY345", "ARFGT769");
		System.out.println(c.aadhar +"\t"+ c.pan);

	}

}