package com.techno.challangearray;

import java.util.Scanner;

public class Time {
	public static String getDurationString(double minute, int second) {
		int Hour = 0;
		int Min = 0;
		String Time;
		if (minute >= 0 && second >= 0 && second <= 59) {
			Hour = (int) minute / 60;
			Min = (int) minute - (Hour * 60);
			Time = Hour + "hr " + Min + "min " + second + "sec";
			return Time;
		} else
			return "Invalid data";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minutes");
		int minute = scan.nextInt();
		System.out.println("Enter seconds");
		int seconds = scan.nextInt();
		String time = getDurationString(minute, seconds);
		System.out.println("Time in hr:min:sec format = " + time);
	}
}