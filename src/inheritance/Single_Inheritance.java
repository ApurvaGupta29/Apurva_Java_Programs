package inheritance;
class Mkt
{
	static void car()
	{
		System.out.println("I have car");
	}
	 void bike()
	{
		System.out.println("I have bike");
	}	
}
public class Single_Inheritance extends Mkt

{
static void pencil()
{
	System.out.println("I have pencil");
}

static void erasor()
{
	System.out.println("I have erasor");
}
	public static void main(String[] args) {
	
		pencil();
		erasor();
		car();
		Single_Inheritance s1=new Single_Inheritance();
		s1.bike();
		
	}

}
