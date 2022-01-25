package com.lc.problem;

import java.util.HashMap;
import java.util.Map;

public class LC_0290_Word_Pattern {

	public static void main(String[] args) {
		LC_0290_Word_Pattern obj = new LC_0290_Word_Pattern();
		boolean result = obj.wordPattern("", "");
		System.out.println(result);
	}
	
	public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMap = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length()) {
            return false;
        }
        int index = 0;
        for(char c : pattern.toCharArray()) {
            if(!patternMap.containsKey(c)) {
            	if(patternMap.containsValue(words[index])) {
            		return false;
            	}
                patternMap.put(c, words[index]);
            } else {
                String w = patternMap.get(c);
                if(!w.equals(words[index])) {
                    return false;
                }
            }
            ++index;
        }
        return true;
    }
	
}
