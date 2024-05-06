package package1;

import java.util.InputMismatchException;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
		int a=1/0;
		System.out.println("try block ");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handling exception 1 ");
	}
		catch(NullPointerException a2)
		{
			System.out.println("Handling exception 2 ");
	}
		
		catch(InputMismatchException a3)
		{
			System.out.println("Handling exception 3 ");
	}
	finally
	{
		System.out.println("No matter i am always there ");
	}
	
	}
}
