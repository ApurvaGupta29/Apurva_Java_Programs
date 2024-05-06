package package1;

public class Local_Variable {

	
static void add() 
{
	int a=1;// Local Variable works only when it get declared & initialized within method & it will utilize after SOP
	int b=10;// Local Variable can never be static & non static. Also it doesn't have any default value to it
	System.out.println(a);
	System.out.println(b);
}

public static void main(String[] args) {
add();
	}

}
