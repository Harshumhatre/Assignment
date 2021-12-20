package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("String");
		System.out.println(c);
		c.add(10);
		System.out.println(c);
		c.add('a');
		System.out.println(c);
		c.add(10.10);
		System.out.println(c);
		c.add(true);
		System.out.println(c);
		c.add(null);
		System.out.println(c);
		Iterator iterator = c.iterator();
		ArrayList list = new ArrayList();
		list.add(20);
		System.out.println(list);
		list.add("Anything");
		System.out.println(list);
		System.out.println(c.contains(20));
		list.clear();
		System.out.println(list);
		c.addAll(list);
		System.out.println(list);
		System.out.println(c);
		System.out.println(c.size());
		System.out.println("The list Container =" + list.isEmpty());
		System.out.println("The c container " + c.isEmpty());
	}
}
