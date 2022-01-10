package com.te.exception1;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) throws BatteryResult {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the battery percentage");
		int percentage = scanner.nextInt();
		CustomException customException = new CustomException();
		if (percentage == 0 && percentage < 15) {
		customException.dead();
		}
		else if (percentage >= 15 && percentage <= 99)
			{
			customException.charging();
			}
		else if (percentage==100) {
			customException.fullyCharged();
			}
	}
	private void dead() throws BatteryResult {
		throw new BatteryResult("your battery is To low");

	}
	private void charging() throws BatteryResult {
		throw new BatteryResult("your battery is charging");

	}

	private void fullyCharged() throws BatteryResult {
		throw new BatteryResult("your battery is fully charged");

	}

}
//else if(percentage>16&&percentage<100)
//{
//throw new BatteryResult("Battery is on charging plz wait");	
//}
//else
//{
//	System.out.println("your battery is fully charged plazz removed");
//}
//}
//try {
//	customException.dead();
//} catch (BatteryResult e) {
//
//	e.printStackTrace();
//}}
