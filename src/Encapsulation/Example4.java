package Encapsulation;

public class Example4 {

	public static void main(String[] args) {
		Example3 obj = new Example3();
		obj.setRollno(50);
		System.out.println("The value of rollno in Example1 Class: "+obj.getRollno());
		
		//if not pass a value in setrollno default will be  0
		Example3 obj1 = new Example3();
		System.out.println("The value of rollno in Example1 Class: "+obj1.getRollno());
}

}
