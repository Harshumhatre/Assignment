package com.techno.set;

import java.util.HashSet;

public class Cricket {
		public static void main(String[] args) {
			HashSet<Team> h1 = new HashSet<Team>();
			h1.add(new Team(1, "Rohit sharma", 10));
			h1.add(new Team(2, "Surayakumar yadav", 20));
			h1.add(new Team(3, "kiron pollard", 30));
			h1.add(new Team(4, "Quienton d'cock", 40));
			h1.add(new Team(5, "ishan kishan", 50));
			h1.add(new Team(6, "saurabh tiwari", 60));
			h1.add(new Team(7, "hardik pandya",70));
			h1.add(new Team(8, "krunal pandya", 80));
			h1.add(new Team(9, "jasprit bumrah", 90));
			h1.add(new Team(10, "culter nile", 100));
			h1.add(new Team(11, "Sachin Tendulkar", 111));
			for (Team t : h1) {
				System.out.println(t);
			}
//			h1.add(new Team(12, "chris gayle", 112));
	//		for (Team t : h1) {
		//		System.out.println(t);
//			}
		}
	}
