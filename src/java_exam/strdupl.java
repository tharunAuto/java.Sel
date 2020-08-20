package java_exam;

public class strdupl {
 
	public static void main(String[] args) {
	String str = "tharunprabhu";
	char[] inp = str.toCharArray();
	int i = inp.length;
	int cnt=0;
	
for (int j = 0;j<i;j++)
{
	for(int k = j+1;k<i;k++)
	{
		if (inp[j]==inp[k])
		{
			System.out.print(inp[k]+",");
			cnt++;
			break;
		}
		
	}
}
}
}
