package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {
public static void main(String[] args) {
LinkedList<Integer> list = new LinkedList<Integer>();
list.add(30);
list.add(15);
list.add(40);
list.add(30);
list.add(50);
list.add(70);
Iterator iterator = list.iterator();
Collections.sort((List<Integer>) list);
while (iterator.hasNext()) {
	System.out.println(iterator.next());
}
}
}
