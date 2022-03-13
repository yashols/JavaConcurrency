package com.lc.problem;

import java.util.ArrayList;
import java.util.List;

public class LC_0438 {

	public static void main(String[] args) {
		LC_0438 obj = new LC_0438();
		String s = "cbaebabacd";
		String p = "abc";
		obj.findAnagrams(s, p);
	}
	
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<=s.length() - p.length(); ++i) {
            String s2 = s.substring(i, i+p.length());
            if(isAnagram(s2, p)) {
                result.add(i);
            }
        }
        return result;
    }
    
    private boolean isAnagram(String s2, String p) {
        char[] pChars = p.toCharArray();
        for(int i=0; i<s2.length(); ++i) {
            boolean found = false;
            int index = 0;
            for(char pChar : pChars) {
                if(s2.charAt(i) == pChar) {
                    found = true;
                    pChars[index] = 'A';
                    break;
                }
                ++index;
            }
            if(!found) {
                return false;
            }
        }
        return true;
    }
    
}
