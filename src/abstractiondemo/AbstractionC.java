package abstractiondemo;

public class AbstractionC extends AbstractionB{

	public AbstractionC(float balance) {
		super(balance);
		System.out.println("i am c constractor:");
	}
	
	public void m1()
	{
	
		System.out.println("Im c m1 method:");
	}

	public void m2()
	{
		System.out.println("im c m2 methos:");
	}
	@Override
	public void m3() {
		System.out.println("m3 method:");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method:");
		
	}

	@Override
	public void m5() {
		System.out.println("m5 method:");

		
	}
	public static void main(String[] args) {
		AbstractionC c=new AbstractionC(897.3f);
        c.m1();
		
		
	 
	}

}
