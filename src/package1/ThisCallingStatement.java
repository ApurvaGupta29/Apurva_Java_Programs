package package1;

public class ThisCallingStatement {
	ThisCallingStatement()
	{this(100);
		System.out.println("Addition of onenumber");
	}
	ThisCallingStatement(int a)
	{
		int	b=a+6; 
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		new ThisCallingStatement();
	}
	
	}


