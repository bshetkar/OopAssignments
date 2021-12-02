package packageA;

public class ChildUsingThisSuperKeyword extends ParentUsingThisSuperKeyword{
        int i=20;
        public void show(int i) {
         System.out.println(i);
         System.out.println(this.i);
         System.out.println(super.i);
		}
        public static void main(String[] args) {
        	ChildUsingThisSuperKeyword c= new ChildUsingThisSuperKeyword();
        	c.show(30);
		}
}
