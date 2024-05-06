package package1;

public class Global_Var {//outside any method & inside class 

	int a= 10;//instance variable
	static int b= 100;//static global variable . Also in global var we cannot initialize and declared in two line. It should always be single line
	static byte c;
	static short d;
	static int e;
	static long f;
	static float g;
	static double h;
	static char i;
	static boolean x;
	static String s;
	public static void main(String[] args) {//global variable has some default value i.e. 0 so no need of initialization to utilize it
		
System.out.println(b);
Global_Var g1=new Global_Var();
System.out.println(g1.a);
c=99;//but we can initialize inside any method; in global variable
System.out.println(c);

System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);//char value is not defined   
System.out.println(x);
System.out.println(s);
	}

}
