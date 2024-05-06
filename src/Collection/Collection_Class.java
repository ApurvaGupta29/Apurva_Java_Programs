package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_Class {

	public static void main (String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(67);
		a1.add(67.767);
		a1.add("Apurva");
		a1.add('M');
		a1.add('M');
		a1.add(null);
		System.out.println(a1);
		a1.get(3);
		System.out.println(a1.get(3));
		Vector v1 = new Vector();
		LinkedList L1 = new LinkedList();
		PriorityQueue P1 = new PriorityQueue();
		TreeSet T1= new TreeSet();
		HashSet H1 = new HashSet();
		LinkedHashSet LH1 = new LinkedHashSet();
		v1.add(67);
		
		
	}

}
