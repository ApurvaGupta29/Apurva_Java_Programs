package Method_Override;
class SchoolA {
	
	void section()
	{
		System.out.println("i am in standard 2A");
	}
}

class SchoolB extends SchoolA {
	
	void section()
	{
		System.out.println("i am in standard 3A");
		super.section();
	}
}

//Always get subclass SOP so to call the super class method we use super.method name)

public class Override extends SchoolB {
	void section()
	{
		System.out.println("i am in standard 5A");
		super.section();
	}
	public static void main(String[] args) {
	
		Override obj= new Override();
		obj.section();
	}

}
