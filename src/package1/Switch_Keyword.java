package package1;

import java.util.Scanner;

public class Switch_Keyword {

	public static void main(String[] args) {
 Scanner	s1=new	Scanner(System.in);
 int	a=s1.nextInt(); 
		switch(a)
   {
   case	1:System.out.println("Addition");
	 //  break;
   case	2:System.out.println("Subtraction");
	   break;
   case	3: System.out.println("Multiplication");  
	   break;
	   default: System.out.println("I am default case");
	   
   }
		

	}

}
