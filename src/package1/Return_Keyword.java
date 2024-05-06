package package1;

public class Return_Keyword {
static int add(int a, int b)
{
	//System.out.println(a+b);
	int c= a+b;
//	System.out.println(c);
	return c;
	
}
double add (int a, double b)	
{
	double c= a+b;
	return c;
	
}
	String add ()
	{
		return "Hi";
	}
	public static void main(String[] args) {
		
System.out.println(add(17,30));
Return_Keyword KR = new Return_Keyword();
System.out.println(KR.add(87, 3.15));


	}

}
