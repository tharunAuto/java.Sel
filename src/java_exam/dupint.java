package java_exam;

public class dupint {

	public static void main(String[] args) {
		int arr[] = {5, 2, 2, 3, 4,5,5};
		System.out.println("Repeating elements: ");
		int ar_s = arr.length;
		for (int i=0;i<ar_s;i++)
		{
			for(int j=i+1;j<ar_s;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+" ");
				}
			}
		}
		
	}
}
