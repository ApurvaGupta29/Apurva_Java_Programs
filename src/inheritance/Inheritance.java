package inheritance;
class Apps {
static int a = 10;
void dairymilk()

{
	System.out.println(a);
{
	System.out.println("DairyMilk");
}
}
static void KitKat(){
int b=1;
System.out.println("KitKat");
System.out.println(b);
}
}

public class Inheritance extends Apps {
static void Mangobite()
{
	System.out.println("MangoBite");
}
void Melody()
{
	System.out.println("Melody");
}
public static void main(String[] args) {
	
Inheritance i1=new Inheritance();

i1.dairymilk();
KitKat();
System.out.println(a);
	}
}
