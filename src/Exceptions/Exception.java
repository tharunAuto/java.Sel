package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exception extends Test1 {
	
	public static String s1;
	
	//throws mathematical mistake in code
	public static void arithmeticException(){
		int i = 2/0;
	}
	
	//throws when the variable has not value into concat;
	public static void nullPointerException(){
		//String s1 = "Test";
		System.out.println(s1.concat("Hing"));
	}
	
	//throws when the instead of file location to read, there is null value
	public static void nullPointerException1(){
		InputStreamReader isr = new InputStreamReader(null);
	}
	
	//throws when the array has some certain size to store 
	//which is limited, if we try to out of memory
	public static void StackOverflowException(){
		List<Integer> is = new ArrayList<Integer>();
		while(true) {
			is.add(1000);
		}
	}

	//throws when we try to change the string into integer, 
	//only we the string with number can change into integer 
	public static void numberFormateException(){
		String not = "Test";
		int t = Integer.parseInt(not);
		int a = 9;
		long l = Long.parseLong(not);
		System.out.println(t);
	}
	//Checked Exception
	//when while reading ,the file not found in specified location
	public static void fileFoundException() throws FileNotFoundException{
		FileReader fr = new FileReader("D:\\Disco.docx"); 
	}
	//throws when we are trying to call the class 
	public static void classFoundException() throws ClassNotFoundException{
		Class.forName("Test1");
	}
	
	//throws when we trying to pass the array more than its size
	public static void arrayIndexOutOfBoundException() {
		int[] cls = new int[5];
		System.out.println(cls[6]);
	}
	
	//throws we are trying to change name of the object of parent into child
	// normally we can change object of the child into parent, but rev is not.
	public static void classCastException() {
		Test1 obj =  new Test1();
		System.out.println((Exception) obj);
	}
	

	public static void main(String[] args){
		//arithmeticException();
		//nullPointerException();
		//nullPointerException1();
		//StackOverflowException();
		//numberFormateException();
		//fileFoundException();
		//classFoundException();
		//arrayIndexOutOfBoundException();
		//classCastException();
	}

}
