import java.util.*;

public class Iterator_ListIterator_Enumeration_Demo {
	
	public static void main(String[] args) {
		List<Object> l=new ArrayList<>();
		l.add("Raju");
		l.add(107);
		l.add("Mehta");
		System.out.println(l);
		
		Iterator<Object> itr=l.iterator();
		System.out.println("by using iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("by using listiterator");
		ListIterator<Object> li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("in backward direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("using foreach loop");
		for(Object temp:l) {
			System.out.println(temp);
		}
		
		Vector<Object> v=new Vector<>();
		v.add("yes");
		v.add("Boss");
		v.add("100%");
		System.out.println(v);
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
				
	}

}
