package Encapsulation;

public class encapsulation2 extends encapsulation {

	public static void main(String[] args) {
		encapsulation2 encap = new encapsulation2();
		encap.setempname("Tharun Prabhu");
		encap.setempno(1777284);
		encap.setemppage(26);
		System.out.println("the name of the emplyee in company:" +encap.getempname());
		System.out.println("the id of the employee in company:" +encap.getempno());
		System.out.println("the age of the employees in the company:" +encap.getempage());

	}

}
