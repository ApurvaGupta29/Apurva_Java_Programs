package package1;
class Authentication
{
	private String username="contact@grotechminds.com";//step1 sensitive
public void SetUsername(String username)//step 2 setter method
{
	this.username=username;
}
public String GetUsername()//step 3 getter method
{
	return username;
}
}

public class Encapsulation_getter 
{
	public static void main(String[] args) {
	Authentication a1=new Authentication();
	a1.SetUsername("lavanya@gmail.com");
System.out.println(a1.GetUsername());
	}

}
