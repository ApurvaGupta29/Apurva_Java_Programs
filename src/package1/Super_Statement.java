package package1;
class Animal
{
	Animal(int	a)
	{
		System.out.println("There is an animal");
	}
static void cat()
{
	System.out.println("cat");
}
void rat()
{ 
	System.out.println("rat");
}
}
public class Super_Statement extends Animal
{
	Super_Statement()
	{
		super(2);
		System.out.println("Main constructor");
	}
static void child ()
{
	System.out.println("child");
}
	public static void main(String[] args) {
Super_Statement S1 =new Super_Statement();
	cat();
	child();
	S1.rat();
{
	System.out.println("constructor main class");
	}
	}
		}


