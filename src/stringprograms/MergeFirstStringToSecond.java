package stringprograms;

public class MergeFirstStringToSecond {
	public static void main(String[] args) {
		String a = "ABCD";
		// System.out.println(a.substring(1));
		String b = "EF";// AEBCDF
		String str = a.substring(1) + b.substring(1);
		// System.out.println("string without concat:" +str);
		str = b.charAt(0) + str;// EBCDF
		str = a.charAt(0) + str;// AEBCDF
		System.out.println(str);

	}

}
