package encapsultionDemo;

public class EncapsultionMethodUsingSingleton {
	private  int emp_iD;
	private static String empname;
	static{
		EncapsultionMethodUsingSingleton empname= new EncapsultionMethodUsingSingleton();
	}
	
	
	private EncapsultionMethodUsingSingleton()
	{
		
	}
	public int getEmp_iD() {
		return emp_iD;
	}
	public void setEmp_iD(int emp_iD) {
		this.emp_iD = emp_iD;
	}
	public static String getEmpname() {
		return empname;
	}
	public static void setEmpname(String empname) {
		EncapsultionMethodUsingSingleton.empname = empname;
	}
	public static EncapsultionMethodUsingSingleton getInstance() {
		return null;
	}
	
	

}
