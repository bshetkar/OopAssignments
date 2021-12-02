package stringprograms;

public class ReverseString {
	public static void main(String[] args) {
		String s="maza dukar gendu sandu pandu african";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse of the string:"  +rev);
		
		/*if(s.equals(rev))
		{
			System.out.println("palidrome string:");
		}else
			System.out.println("not palidrome string:");*/
	}

}
