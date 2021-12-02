package packageA;

public class CitiBank extends Customer {
	public CitiBank(String aadhar, String pan) {

		super(aadhar, pan);
		
	}

	public static void main(String[] args) {
		CitiBank c = new CitiBank("655678", "987655566");
		System.out.println(c.aadhar);

	}

}
