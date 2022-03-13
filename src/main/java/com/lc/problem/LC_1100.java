package com.lc.problem;

import java.util.HashSet;
import java.util.Set;

public class LC_1100 {

	public static void main(String[] args) {
		LC_1100 obj = new LC_1100();
		int result = obj.numKLenSubstrNoRepeats("havefunonleetcode", 5); //
		System.out.println(result);
	}
	
	public int numKLenSubstrNoRepeats(String s, int k) {
        int result = 0;
        Set<Character> setChars = new HashSet<>();
        char[] chars = s.toCharArray();
        int prev = 0;
        for(int i =0; i<chars.length; ++i) {
        	
            if(!setChars.contains(chars[i])){
            	setChars.add(chars[i]);
                if(setChars.size() == k) {
                    ++result;
                    print(prev, i, chars);
                    setChars.remove(chars[prev]);
                    ++prev;
                }
            } else {
            	setChars.remove(chars[prev]);
                ++prev;
                --i;
            }
        }
        
        return result;
    }

	private void print(int prev, int i, char[] chars) {
		for(int j=prev; j<=i; ++j) {
			System.out.print(chars[j]);
		}
		System.out.println("");
	}
	
}
