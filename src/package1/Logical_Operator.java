package package1;

public class Logical_Operator {

	public static void main(String[] args) {
		int	a=100;
		int	b=200;
		if(a>90	||b<20)
		{
			System.out.println("Logical operator");
		}
		
		if(a>90	&& b<20)
		{
			System.out.println("Logical operator");
		}
		System.out.println("outside	if	block");
		if(a!=90 &&	b==4) 
		{
			System.out.println("Logical operator");
		}
		System.out.println("outside	if	block");
	}

}
