package com.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestStringWithMax2Chars {

    public static void main(String args[]) {

        System.out.println(longestSubStringKUniqueChar("aabbcc", 3));

        System.out.println(longestSubStringKUniqueChar("aabbcc", 2));

        System.out.println(longestSubStringKUniqueChar("aabbcc", 1));

        System.out.println(longestSubStringKUniqueChar("aabbcccccc", 1));

        System.out.println(longestSubStringKUniqueChar("aabacbebebe", 3));

        System.out.println(longestSubStringKUniqueChar("aaabbb", 3));
    }


    public static String longestSubStringKUniqueChar(String string, int k) {

        String subStr = "";
        if (null == string || string.length() == 0 || k == 0)
            return subStr;

        string = string.trim();

        char str[] = string.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int totalUnique = 0, countOfUnique = 0;

        int start = 0;

        for (int i = 0; i < str.length; i++) {

            if (!map.containsKey(str[i])) {
                countOfUnique++;
                totalUnique++;
                map.put(str[i], 1);
            } else {
                map.put(str[i], map.getOrDefault(str[i], 0) + 1);
            }

            if (countOfUnique == k) {
                if (subStr.length() < (i - start + 1)) {
                    subStr = string.substring(start, i + 1);
                }
            } else if (countOfUnique > k) {
                while (countOfUnique > k) {
                    char c = str[start];
                    if (map.get(c) > 0) {

                        map.put(c, map.getOrDefault(c, 1) - 1);

                        if (map.get(c) == 0)
                            countOfUnique--;
                    }
                    start++;
                }
            }

        }

        if (totalUnique < k)
            throw new IllegalArgumentException("input has less unique char then require");
        return subStr;

    }


    protected int check(char[] str) {
        if (str == null || str.length == 0 || str.length == 1 || (str.length == 2 && str[0] == str[1])) {
            return 0;
        }
        if (str.length == 2 && str[0] != str[1]) {
            return 2;
        }
        int maxLength = 0;
        int index = 2;

        for (int i = 0; i < str.length - 1; ++i) {
            Character firstChar = str[i];
            Character secondChar = null;
            for (int j = i + 1; j < str.length; ++j) {

                if (secondChar == null) {
                    if (str[j] != firstChar) {
                        secondChar = str[j];
                    } else {
                        index = 2;
                    }
                    continue;
                }
                if (str[j] == firstChar || str[j] == secondChar) {
                    ++index;
                } else {
                    break;
                }
            }
            if (secondChar == null) {
                index = 0;
            } else if (maxLength < index) {
                maxLength = index;

            }
        }
        return maxLength;
    }

    public int checkLength(String str) {
        if (str == null || str.length() == 0 || str.length() == 1) {
            return 0;
        }
        Set<Character> set = new HashSet<Character>();
        int max = 0;

        for(int i=0; i<str.length()-1; i++){
            int count = 0;
            for(int j=i; j<str.length(); j++){
                set.add(str.charAt(j));
                if(set.size() < 2){
                    count += 1;
                }
                else if(set.size() == 2){
                    max = Math.max(count += 1, max);
                }
                else if(set.size() > 2){
                    break;
                }
            }
            set.clear();
        }
        return max;
    }
}
