package packageA;

public class DemoOfpolymerphism {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int x,int y,int z) {
		return add(x,y)+z;
		}
	public int add(int...x) {
		int r=0;
		for(int i=0;i<=x.length-1;i++)
		{
			r=r+x[i];
		}
		return r;
	}
	public static void main(String[] args) {
		DemoOfpolymerphism d= new DemoOfpolymerphism();
		System.out.println(d.add(4));
	}

}
