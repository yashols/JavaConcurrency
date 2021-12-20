package com.lc.problem.easy;

import java.util.HashMap;
import java.util.Map;

public class LC_1507_Reformat_Date {

	public static void main(String[] args) {
		LC_1507_Reformat_Date obj = new LC_1507_Reformat_Date();
		String response = obj.reformatDate("20th Feb 2052");
		System.out.print(response);
	}

	public String reformatDate(String date) {
		Map<String, String> months = new HashMap<String, String>();
		
		months.put("Jan", "01");
		months.put("Feb", "02");
		months.put("Mar", "03");
		months.put("Apr", "04");
		months.put("May", "05");
		months.put("Jun", "06");
		months.put("Jul", "07");
		months.put("Aug", "08");
		months.put("Sep", "09");
		months.put("Oct", "10");
		months.put("Nov", "11");
		months.put("Dec", "12");
		
		String[] dates = date.split(" ");
		
		String day = dates[0].substring(0, dates[0].length() - 2);
		String d = day.length() == 1 ? "0"+day : day; 
		StringBuffer sb = new StringBuffer();
		sb.append(dates[2]);
		sb.append("-");
		sb.append(months.get(dates[1]));
		sb.append("-");
		sb.append(d);
		return sb.toString();
		
	}
}
