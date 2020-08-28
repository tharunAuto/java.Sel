package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	
	public static void main(String[] args) {
		List<Object> arrlist = new LinkedList<Object>();
		long startTime = System.nanoTime();
		arrlist.add(45621);
		arrlist.add(21456);
		arrlist.add(24561);
		arrlist.add(46215);
		arrlist.add(62145);
		arrlist.add(21456);
		arrlist.add(14562);
		arrlist.add(56241);
		arrlist.add(24561);
		arrlist.add(62451);
		System.out.println(arrlist);
		long endTime = System.nanoTime();
		long totalTime = (endTime-startTime)/1000;
		System.out.println(totalTime);
		List<Object> arrStr = new LinkedList<Object>();
		long startTime1 = System.nanoTime();
		arrStr.add("tharun");
		arrStr.add("tharun1");
		arrStr.add("tharun2");
		arrStr.add("tharun3");
		arrStr.add("tharun4");
		arrStr.add("tharun5");
		System.out.println(arrStr);
		long endTime1 = System.nanoTime();
		long totalTime1 = (endTime1-startTime1)/1000;
		System.out.println(totalTime1);
		long startTime2 = System.nanoTime();
		arrlist.addAll(2,arrStr);
		long endTime2 = System.nanoTime();
		long totalTime2 = (endTime2-startTime2)/1000;
		System.out.println(totalTime2);
		long startTime3 = System.nanoTime();
		System.out.println(arrlist);
		long endTime3 = System.nanoTime();
		long totalTime3 = (endTime3-startTime3)/1000;
		System.out.println(totalTime3);
		long startTime4 = System.nanoTime();
		arrlist.remove(2);
		System.out.println(arrlist);
		long endTime4 = System.nanoTime();
		long totalTime4 = (endTime4-startTime4)/1000;
		System.out.println(totalTime4);
		long startTime5 = System.nanoTime();
		arrlist.remove("tharun2");
		System.out.println(arrlist);
		long endTime5 = System.nanoTime();
		long totalTime5 = (endTime5-startTime5)/1000;
		System.out.println(totalTime5);
		arrlist.set(5, 11111);
		long startTime6 = System.nanoTime();
		System.out.println(arrlist);
		long endTime6 = System.nanoTime();
		long totalTime6 = (endTime6-startTime6)/1000;
		System.out.println(totalTime6);
		}
}
