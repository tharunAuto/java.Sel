package java_exam;

public class StrReplace {

	public static void main(String[] args) {
		String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
		String s2 = s1.replaceAll("Java", "Kava");

		System.out.println("the changed as "+s2);
	}

}
