package package1;

public class Throws_throw {

	public static void main(String[] args) throws ArithmeticException, InterruptedException
	{
		int age=6;
		System.out.println("i am looking");
		System.out.println("i am breathing");
		Thread.sleep(3000);
		System.out.println("i am awake now");
		if(age>=18)
			
		{
			System.out.println("welcome to googleoffice");
		}
		else
		{
			throw new ArithmeticException("You are still young");
		}
	}

}
