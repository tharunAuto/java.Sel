package java_exam;

import java.util.Scanner;

public class altcasr {

	public static void main(String[] args) {
		String Original,Reverse="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		Original = sc.nextLine();
		int l = Original.length();
		for (int i=0;i<l;i++)
		{
			char ch = Original.charAt(i);
					if(i%2 == 0)
					{
						Reverse += Character.toUpperCase(ch);
					}else
					{
						Reverse += Character.toLowerCase(ch);
					}
				}
		System.out.println("the alternative value is "+Reverse);
	}
}
