package packageA;

public class WithParamizedConstructor {
	String name;
	int roll_no;
	public WithParamizedConstructor(String name,int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;
	}
	public static void main(String[] args) {
		WithParamizedConstructor s= new WithParamizedConstructor("rahul",1);
		System.out.println(s.name);
		System.out.println(s.roll_no);
	
		
		
	}

}
