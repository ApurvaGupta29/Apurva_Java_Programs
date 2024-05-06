package Method_Override;

abstract class Fish{
	
	abstract void shark();
	abstract void whale();
	void dolphine()
	{
		System.out.println("i love dolphine");
	}
	
}

abstract class Perfume extends Fish{
	
	abstract void VictoriaSecrete();
	abstract void BlueLady();
	
	void Dressberry()
	{
		System.out.println("i love dolphine");
	}
	
}


public class Abstract_ConcreteMethod extends Perfume {

	public static void main(String[] args) {
		
		Abstract_ConcreteMethod obj0 = new Abstract_ConcreteMethod();
		obj0.BlueLady();
		obj0.dolphine();
		obj0.Dressberry();
		obj0.shark();
		obj0.VictoriaSecrete();
		obj0.whale();
	}

//	@Override
	void VictoriaSecrete() {
		
			System.out.println("i love VictoriaSecrete");
		
	}

	//@Override
	void BlueLady() {
		
		System.out.println("i love BlueLady");
	}

	//@Override
	void shark() {
		System.out.println("i love Shark");
		
	}

	//@Override
	void whale() {
		
		System.out.println("i love Whale");
	}

}
