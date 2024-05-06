package Type_Casting;

class Up_Casting {

	static int a= 10;
	int b= 20;
	static void banglore()
	{
		System.out.println("starts from banglore");
	}
	
	void Mumbai()
	{
		System.out.println("i went to mumbai");
	}
}
	
	public class Classtype_Casting extends Up_Casting {
		
		void start()
		{
			System.out.println("i am sub class");
			
	}
	public static void main(String[] args) {
		
		Up_Casting d2 = new Classtype_Casting();//upcasting done 
		banglore();
		d2.Mumbai();
		
		Classtype_Casting d3 = (Classtype_Casting)d2;//convert superclass object d2 to sub class type-downcasting//this can be done by explicitly only 
		d3.start();
		d3.Mumbai();
		
	}
	}


