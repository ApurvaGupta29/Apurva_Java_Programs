package inheritance;

interface college
{
	void addition();
	void subtract();
	// before java 1.8 we cannot write concrete method in interface but now we can create it
	
}






public class Multiple implements college {

	public static void main(String[] args) {
Multiple obj9=new Multiple();
obj9.addition();
obj9.subtract();
	}

	@Override
	public void addition() {
System.out.println("add");		
	}

	@Override
	public void subtract() {
		
		System.out.println("sub");
	}

}
