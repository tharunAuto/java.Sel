package java_exam;

import java.util.Scanner;

public class strRev {

	public static void main(String[] args) {
		String original,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		original = sc.nextLine();
		int l = original.length();
		for(int i=l-1;i>=0;i--)
		{
			char ch = original.charAt(i);
			reverse += ch;
		}
			System.out.println(reverse);
	}

}
