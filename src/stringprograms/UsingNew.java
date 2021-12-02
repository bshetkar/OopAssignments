package stringprograms;


public class UsingNew {
	public static void main(String[] args) {
		String s= new String("Hello");
		String s1=new String("Hello");
		System.out.println(s.equals(s1));
		
		if(s==s1)
		{
			System.out.println("both address are equal:");
		}else
			System.out.println("address are not equal:");
		
	}

}
