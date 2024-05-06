package Type_Casting;
class AP {
	
static void AP1()
{
	System.out.println("i visit AP-place1");
}

void AP2()

{
	System.out.println("i visit AP-place2");
}
}
class UP extends AP {
//stop1

	static void UP1()
	{
		System.out.println("i visit U-place1");
	}

	void UP2()

	{
		System.out.println("i visit U-place2");
	}

}
class Bihar extends UP {
	 

//start point

static void place1()
{
	System.out.println("i visit B-place1");
}

void place2()

{
	System.out.println("i visit B-place2");
}


public class India_Map extends Bihar {

	public static void main(String[] args) {
		UP t1=new Bihar();//without upcasting...downcasting not possible
		t1.AP2();
		Bihar b2 = (Bihar) t1;
		b2.AP2();
	}
}
}

