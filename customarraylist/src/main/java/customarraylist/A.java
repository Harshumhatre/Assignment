package customarraylist;

import java.util.Iterator;

public class A {
public static void main(String[] args) {
	MyArraylist myArraylist = new MyArraylist(5);
	myArraylist.add(1);
	myArraylist.add(2);
	myArraylist.add(3);
	myArraylist.add(1);
	myArraylist.add(4);
	myArraylist.add(5);
	System.out.println(myArraylist);
	myArraylist.remove(1);
	System.out.println(myArraylist);
	Iterator iterator = myArraylist.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
