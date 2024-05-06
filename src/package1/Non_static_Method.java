package package1;

public class Non_static_Method {
	
	void mul() //to call any non static method always create object) 
	{
		System.out.println("i am mul method");
	}
	
	void sub()
	{
		System.out.println("i am sub method");
	}
	
	static void add()
	{
		System.out.println("i am add method");
	}
	public static void main(String[] args) {
		
Non_static_Method N1= new Non_static_Method();
N1.mul();
N1.sub();
add();
	}

}
