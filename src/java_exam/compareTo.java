package java_exam;

public class compareTo {
 
	public static void main(String[] args) {
	String s1 = "nivas";
	String s2 = "NIVAS";
	String s3 = "karthika";
	
	int i1 = s1.compareTo(s2);
	int i2 = s2.compareTo(s3);
	int i3 = s1.compareToIgnoreCase(s2);
	
	System.out.println("the comparsion of three values are: " +i1+" "+i2+" "+i3);
	
}
}
