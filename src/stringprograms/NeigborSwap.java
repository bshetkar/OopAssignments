package stringprograms;

public class NeigborSwap {
	public static void main(String[] args) {
		String s = "bhagu";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length - 1; i += 2) {
			char temp = c[i];
			c[i] = c[i + 1];
			c[i + 1] = temp;

		}
		System.out.print(c);
		/*
		 * String s="ABCD";//BADC char ch[]=s.toCharArray(); for(int
		 * i=0;i<ch.length-1;i+=2) { char temp=ch[i]; ch[i]=ch[i+1]; ch[i+1]=temp; }
		 * System.out.println(ch);
		 */
	}

}
