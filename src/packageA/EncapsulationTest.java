package packageA;

public class EncapsulationTest {
	public static void main(String[] args) {
		EncapsulationEmployee satish = new EncapsulationEmployee();
		satish.setEmpId(34);
		System.out.println("display the satish empId:" +satish.getEmpId());
		
		EncapsulationEmployee priya =new EncapsulationEmployee();
		System.out.println("display the priya empID:"+priya.getEmpId());
		
		EncapsulationEmployee bhagu= new EncapsulationEmployee();
		bhagu.setname("rahul");
		System.out.println("display employee name:"+ bhagu.getname());
		}

}
