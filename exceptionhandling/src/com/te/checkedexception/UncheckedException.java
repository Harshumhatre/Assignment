package com.te.checkedexception;
public class UncheckedException {  // a exception which is not checked by the compliler is called as unchecked or 
public static void main(String[] args) {
	int a=100;
	int b=0;
	int c=a/b;      //Runtime exception
	System.out.println(c);
}
}
