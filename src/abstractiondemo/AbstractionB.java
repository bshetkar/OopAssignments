package abstractiondemo;

public abstract class AbstractionB extends AbstractionA{
   public float balance;
   
   public AbstractionB(float balance)
   {
	   balance=this.balance;
	   System.out.println("im b constructor");
   }
   
	@Override
	public void m1() {
     System.out.println("im b m1 method:");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 mathod:");
	}

}
