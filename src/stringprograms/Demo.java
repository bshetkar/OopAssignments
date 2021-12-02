package stringprograms;

public class Demo {
	public static void main(String[] args) {
		String s = "HELLO";
		String s1 = " bhagyashree ";
		char c[]= {'h','e','l','l','o'};
	
		System.out.println("lenght of the string:" + s.length());
		
		System.out.println("join the two string:" + s.concat(s1));
		
		System.out.println("replace unnecessary spcae:" + s1.trim());
		
		System.out.println("display the index of the given string:" + s.charAt(3));
		
		System.out.println("display s & s1 are equal or not:"+s.equals(s1));
		
		System.out.println("replace old char to new char:"+s1.replace('b', 'k'));
		
		System.out.println(s.toLowerCase());// HELLO is print from small letter
		
		System.out.println(s1.toUpperCase());// bhagyashree is print form capital letter
		
		if(s.contains("ello"))// it check partial char
		{
			System.out.println("Is there:");
			
		}else
			System.out.println("not there:");
		
		String a=new String(c,0,4);// display char to string
		System.out.println(a);
		
		String i="Hi";
		String j="Hi";
		System.out.println(i.equals(j));
		
		if(i==j)
		{
			System.out.println("address are equal:");
		}else
			System.out.println("address are not equal:");
		
		
	}

}