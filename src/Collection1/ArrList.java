package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("RAM");//add something in array
		a1.add(51);
		a1.add('M');
		a1.add(49);
		a1.add("RAM");//accept duplicate
		a1.add(null);//accept null value 
		Collections.sort(a1);
		System.out.println(a1);
/*its dynamic in nature... it keeps on adding
		ArrayList a2 = new ArrayList();
		a2.add(51);
	//	a2.add('M');
		a2.add(51.9);
		a2.add(50);
	
		System.out.println(a2);*/
	}

}
    