package Method_Override;
abstract class MKT {
	
	abstract void div();
	abstract void add();
	abstract void sub();

}//in abstract class we can create both abstract & concrete method
//concrete means where both declaration & implementation of method 
//in abstract we have only declaration ex void abc();

public class Abstract_Method extends MKT {

	public static void main(String[] args) {
		Abstract_Method obj1= new Abstract_Method();
		obj1.add();
		
	}

	//override
	void div() {
		System.out.println("test2");
	}
	

	
	void add() {
		System.out.println("test4");
	}


	void sub() {
		System.out.println("test1");
		
	
	}
}


