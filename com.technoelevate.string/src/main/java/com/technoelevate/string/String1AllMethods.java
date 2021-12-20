package com.technoelevate.string;

public class String1AllMethods {
	public static void main(String[] args) {
		char[]a11=new char[] {'a','b','c','d'};
		String a12=new String ("abc");
		System.out.println(a11);
		System.out.println(a12);
		String s1="deepak";
		String s2="harshad";
	
		System.out.println(s1.equals(s2));
		String s3="harsH";
		String s4="Harsh";
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println("---------------------------");
		String a1="a";
		String a2="A";
		System.out.println(a1.compareTo(a2));
		String a3="abc";
		String a4="Abc";
		String a5="dAc";
		System.out.println(a3.compareTo(a5));
		String b1="This is demo";
		System.out.println(b1.replace("is", "was"));
		System.out.println(b1.replaceFirst("is", "was"));
		System.out.println(b1.replaceAll("is", "was"));
		System.out.println("==================================");
		String s="Hardshad";
		System.out.println(s.indexOf('d'));
		System.out.println(s.indexOf('r'));
		System.out.println(s.charAt(4));
		//System.out.println(s.charAt(43));
		System.out.println(s.contains("ha"));
		System.out.println(s.contains("f"));
		System.out.println(s.startsWith("s"));
		System.out.println(s.startsWith("h"));
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("s"));
		System.out.println(s.endsWith("d"));
		System.out.println("-------------------------------------------");
		String c="harshad";
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(c.length());
		System.out.println("========================");
		int a=10;
		int b=20;
		String c1=String.valueOf(a);
		String c2=String.valueOf(b);
		System.out.println(a+b);
		System.out.println(c1+c2);
		String name="Harhu";
		System.out.println(name.isEmpty());
		String name1="";
		System.out.println(name1.isEmpty());
		String nam1="  abc  ";
		System.out.println(nam1.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

