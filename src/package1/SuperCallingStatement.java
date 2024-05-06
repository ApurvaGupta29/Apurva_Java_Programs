package package1;
class State
{
State()
{
	System.out.println("state method");
}
}
public class SuperCallingStatement extends State
{
	SuperCallingStatement()
	
	{
//super();//non parameterized//implicitly call     
		System.out.println("citymethod");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new  SuperCallingStatement();
	}

}

	
