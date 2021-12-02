package interfacedemo;

public class ChildL extends ParentL implements InterfaceL1,InterfaceL2{
       public ChildL()
       {
    	   System.out.println("Im interface child constructor");
       }

	public void add(int a, int b) {
	    int d= a+b;
	}
     public static void main(String[] args) {
		ChildL c=new ChildL();
		c.m1();
		c.add(10, 20);
	
	}

}
