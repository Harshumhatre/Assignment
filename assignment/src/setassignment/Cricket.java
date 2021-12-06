package setassignment;

import java.util.HashSet;

public class Cricket {
public static void main(String[] args) {
	HashSet<Team> hashSet = new HashSet();
	hashSet.add(new Team("Rohit Sharma", 31, 1, 1)); 
	hashSet.add(new Team("Suraykumar Yadav",32, 2, 2));
	hashSet.add(new Team("Ishan Kishan", 24, 33, 3));
	hashSet.add(new Team("Quienton De'cock", 31, 34, 4));
	hashSet.add(new Team("Kiron Pollard", 34, 35, 5));
	hashSet.add(new Team("Hardik Pandya",26, 36, 6));
	hashSet.add(new Team("Krunal Pandya", 32, 37, 7));
	hashSet.add(new Team("Rahul Chahr", 28, 38, 8));
	hashSet.add(new Team("Jasprit Bumrah", 26, 39, 9));
	hashSet.add(new Team("Trend Bolt", 33, 40, 10));
	hashSet.add(new Team("Saurabh Tiwari", 34, 41, 11));
	for(Team team : hashSet)
	{
		System.out.println(team);
	}
	System.out.println("====================================");
	hashSet.add(new Team("Harshad Mhatre", 24, 35, 12));
	for(Team team:hashSet)
	{
		System.out.println(team);
	}
}
}
