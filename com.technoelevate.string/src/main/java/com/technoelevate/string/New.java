package com.technoelevate.string;

import java.util.Iterator;

public class New {
public static void main(String[] args) {
	int array [] = {1,2,3,5,6};
	int len = array.length/2;
	for (int i = 0; i < len; i++) {
		int tem = array[i];
		array[i]=array[len+1+i];
		array[len+1+i]=tem;
	}
	for(int result : array) {
		System.out.print(result);
	}
}
}
