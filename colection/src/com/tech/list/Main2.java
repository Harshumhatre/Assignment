package com.tech.list;

public class Main2 {
public static void main(String[] args) {
	CustmArraylist custmArraylist = new CustmArraylist(2);
	custmArraylist.add(1);
	custmArraylist.add(2);
	custmArraylist.add(3);
	custmArraylist.add(5);
	System.out.println(custmArraylist);
	custmArraylist.remove(0);
	System.out.println(custmArraylist);
}
}
