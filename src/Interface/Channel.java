package Interface;

interface ColorsTv{
	
	void tv();
	void tv1();
}


abstract class StarPlus implements ColorsTv{
	
	abstract void Movie();
	abstract void Movie1();
	
	void Movie3()
	{
		System.out.println("movie3");
	}
}


public class Channel extends StarPlus{

	public static void main(String[] args) {
		Channel obj=new Channel();
		obj.Movie();

	}

	@Override
	public void tv() {
		System.out.println("TV");
	}

	@Override
	public void tv1() {
		System.out.println("TV1");
	}

	@Override
	void Movie() {
		System.out.println("Movie");
		
	}

	@Override
	void Movie1() {
		System.out.println("Movie1");
		
	}

}
