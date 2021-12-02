package stringprograms;

public class FindTheVowelsFromGivenString {
	public static void main(String[] args) {
		String s= "Hello Bhagyashree";
		for(int i=0;i<=s.length()-1;i++)
		{
		char c=s.charAt(i);
		if(c=='a' || c=='e' || c=='i' || c=='o')
		{
			System.out.println("print the vowels present in geiven string:" +c);
		}
		}
	}

}
