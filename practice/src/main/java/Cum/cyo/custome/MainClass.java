package Cum.cyo.custome;

public class MainClass {
public static void main(String[] args) {
	MyArrayList myArrayList = new MyArrayList(2);
	myArrayList.add("Harshad");
	myArrayList.add("Vivek");
	myArrayList.add("Rahul");
	myArrayList.add("Adwait");
	myArrayList.add("Manjunath");
	System.out.println(myArrayList);
	myArrayList.remove(1);
	System.out.println(myArrayList);
}
}
