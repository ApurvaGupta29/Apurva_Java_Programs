package Type_Casting;
class Bhopal1 {
static void B1()
{
	System.out.println("i visit Bhopal-place1");
}
void B2()
{
	System.out.println("i visit Bhopal-place2");
}
}
class Nagpur extends Bhopal1 {
	static void NG1()
	{
		System.out.println("i visit NG-place1");
	}
	void NG2()
	{
		System.out.println("i visit NG-place2");
	}
}
class Jammu extends Nagpur {
static void JM1()
{
	System.out.println("i visit JM-place1");
}
void JM2()
{
	System.out.println("i visit JM-place2");
}
}
public class Chennai extends Jammu {
	
public static void main(String[] args) {
		Bhopal1 obj1=new Nagpur();
		obj1.B2();
		Bhopal1 obj2 =new Chennai();
		Chennai obj3=(Chennai)obj2;
		obj3.JM2();
	}
}
