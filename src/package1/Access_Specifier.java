package package1;

public class Access_Specifier {//within the class if you have multiple type of access modifier then we can call every one no matter what it type is

	public static void main(String[] args) {
		home();
		Access_Specifier a1=new Access_Specifier();
		a1.add1();
		a1.sub();
		a1.car();
	}	
	private void add1()
	{
		System.out.println("1");
	}
protected void sub()
 
	{
	System.out.println("2");
	}
public static void home()
{
	System.out.println("3");
}

void car()

{
	System.out.println("4");
}
}
  
