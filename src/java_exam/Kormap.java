package java_exam;

public class Kormap {

	public void intArr(int guess){
		String temp = Integer.toString(guess);
		int i = temp.length();
		int[] row = new int[i];
		for(int j=0;j<i;j++) {
			row[j] = temp.charAt(j)-'0';
		}
		int arr = row.length;
		for(int k=0;k<arr;k++) {
			System.out.println(row[k]);
		}
		for(int a=0;a<arr;a++) {
			for(int b=a;b<arr;b++) {
				if(row[a] > row[b])
				{
					int tep = row[a];
					row[a] = row[b];
					row[b] = tep;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int u=0;u<arr-1;u++) {
			System.out.print(row[u]+ ",");
		}
		System.out.println(row[arr-1]);
	}
	public static void main(String[] args) {
		Kormap map = new Kormap();
		map.intArr(569070516);
		}

}
