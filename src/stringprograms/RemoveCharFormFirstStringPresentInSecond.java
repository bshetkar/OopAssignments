package stringprograms;

public class RemoveCharFormFirstStringPresentInSecond {
	public static void main(String[] args) {
		String s = "india is Great";
		String s1 = "in";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0; j<s1.length();j++)
			{
				if(s.contains(s1))
				{
					 s=s.replace(s1, "");
				}
			}
		}
		System.out.println(s);
		
	}
}

	
		
		
	

