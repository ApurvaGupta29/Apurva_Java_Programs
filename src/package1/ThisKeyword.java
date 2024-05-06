package package1;


public class ThisKeyword
{
	int	age;
	String	name;
	double	weight;
	
void studentinfo(int age,String name,double	weight)
{
	this.age=age;
	//this.name=name;
}

	public static void main(String[] args) {
		ThisKeyword	t1	=new ThisKeyword();
		t1.studentinfo(21,"Ram",65.87);
System.out.println(t1.age);	
System.out.println(t1.name);
System.out.println(t1.weight);
}

}
