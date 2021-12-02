package stringprograms;

import java.util.Scanner;

public class FindOccuranceOfEachCharacter1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		int[] count = new int[255];
		str = str.replaceAll("\s", "");
		int length = str.length();
		for (int i = 0; i < length; i++) {
			count[str.charAt(i)]++;
		}
		char[] ch = new char[str.length()];
		for (int i = 0; i < length; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1) {
				System.out.println(str.charAt(i) + " : " + count[str.charAt(i)]);
			}
		}
	}

}
