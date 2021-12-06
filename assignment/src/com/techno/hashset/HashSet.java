package com.techno.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
			linkedHashSet.add(200);
			linkedHashSet.add(150);
			linkedHashSet.add(340);
			linkedHashSet.add(40);
			linkedHashSet.add(49);
			linkedHashSet.add(404);
			Iterator<Object> iterator = linkedHashSet.iterator();
			while (iterator.hasNext()) {
				Object object = (Object) iterator.next();
				System.out.println(object);
			}
		}

	}

