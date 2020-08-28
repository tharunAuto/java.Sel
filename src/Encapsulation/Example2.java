package Encapsulation;

public class Example2 {

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.setRollno(50);
		System.out.println("The value of rollno in Example1 Class: "+obj.getRollno());
		
		//if not pass a value in setrollno default will be  0
		Example1 obj1 = new Example1();
		System.out.println("The value of rollno in Example1 Class: "+obj1.getRollno());
}

}
