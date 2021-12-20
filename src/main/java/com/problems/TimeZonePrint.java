package com.problems;

import java.util.TimeZone;

public class TimeZonePrint {

	
	public static void main(String[] args) {
		TimeZonePrint obj = new TimeZonePrint();
		String[] times = TimeZone.getAvailableIDs();
		for(String time : times) {
			System.out.println(time);
		}
	}
	
}
