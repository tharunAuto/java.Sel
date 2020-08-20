package java_exam;

public class Interexap2 extends Interexap1 implements Interexap {

	public void bike() {
		System.out.println("Brake is interface mount Interexap2");
	}
	
	public void brake1()
	{
		int maxspeed = 500;
		System.out.println("Brake1 is interface amount Interexap2: "+super.maxspeed);
	}

	public void brake()
	{
		int maxspeed = 6000;
		System.out.println("Brake is interface amount 2: "+super.maxspeed);
	}		
	
	public static void main(String[] args) {
		Interexap2 esc = new Interexap2();
		esc.bike();
		esc.brake1();
		esc.brake();
		
		
	}

	
}
