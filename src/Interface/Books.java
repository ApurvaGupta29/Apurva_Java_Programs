package Interface;
interface A  {
	void AA();
	void BB();
}
interface B  {
	
	void AAA();
	void BBB();
}
public class Books implements A,B {

	public static void main(String[] args) {

		Books obj1=new Books();
		obj1.AA();
		obj1.AAA();
		obj1.BB();
		obj1.BBB();
		        
	}

	@Override
	public void AAA() {
		System.out.println("i love books");
		
	}

	@Override
	public void BBB() {
		System.out.println("i love movies");
		
	}

	@Override
	public void AA() {
		System.out.println("i love reading");
		
	}

	@Override
	public void BB() {
		System.out.println("i love Java");
		
	}

}
