package com.problems;

import java.util.ArrayList;
import java.util.Collections;

public class LC_6001 {

	public static void main(String[] args) {
		LC_6001 obj = new LC_6001();
		System.out.println(obj.smallestNumber(2170596702L));
	}
	
	public long smallestNumber(long num) {
        if(num == 0) {
            return num;
        }
        long result = 0;
        ArrayList<Long> list = new ArrayList<>();
        if(num > 0) {
            while(num > 0) {
                Long remainder = num % 10;
                num  = num / 10;
                list.add(remainder);
            }
            Collections.sort(list);
            int counter = 0;
            while(list.get(counter) == 0) {
                ++counter;
            }
            if(counter != 0) {
	            list.set(0, list.get(counter));
	            list.set(counter, 0L);
            }
            counter = 0;
            
            while(counter < list.size()) {
                result = result * 10 + list.get(counter++);
            }
        } else {
        	long num2 = -1*num;
            while(num2 > 0) {
                Long remainder = num2 % 10;
                num2  = num2 / 10;
                list.add(remainder);
            }
            Collections.sort(list, Collections.reverseOrder());
            int counter = 0;
            
            while(counter < list.size()) {
                result = result * 10 + list.get(counter++);
            }
            result = result * -1;
        }
        return result;
    }
}
