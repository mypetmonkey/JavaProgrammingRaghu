import java.util.*;

public class Iterator_ListIterator_Enumeration_Demo {
	
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("Raju");
		l.add(107);
		l.add("Mehta");
		System.out.println(l);
		Iterator itr=l.iterator();
		System.out.println("by using iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("by using listiterator");
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("in backward direction");
		//ListIterator lit=l.listIterator();
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		Vector v=new Vector();
		v.add("yes");
		v.add("Boss");
		v.add("100%");
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
				
	}

}
