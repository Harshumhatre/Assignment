package com.te.checkedexception;

class Voting1 {
	public static void main(String[] args) //throws UnderAgeException
	{
		int  age=19;
		try {
		if (age<18) {
			throw new UnderAgeException();
		}
		else
		{
			System.out.println("you are eligible for voting");
		}
		}
		catch (UnderAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}