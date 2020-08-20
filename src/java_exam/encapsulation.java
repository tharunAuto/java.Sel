package java_exam;

public class encapsulation {

	private int empno;
	private String empname;
	private int empage;
	
	public void setempno(int newvalue)
	{
		empno = newvalue;
	}
	public void setempname(String newname)
	{
		empname = newname;
	}
	public void setemppage(int newage)
	{
		empage = newage;
	}
	public int getempno()
	{
		return empno;
	}
	public String getempname()
	{
		return empname;
	}
	public int getempage()
	{
		return empage;
	}
}
