package packageA;

public class InheritanceChild extends InheritanceParent{
	public int add(int x, int y) {
		return x+y;
		}
	public int division(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		InheritanceChild i=new InheritanceChild();
		System.out.println(i.add(4, 9));
		System.out.println(i.multiply(5, 8));
		System.out.println(i.division(9, 9));
		
	}
	

}
