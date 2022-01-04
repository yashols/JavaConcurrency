package com.lc.problem.medium.set1;

/**
 * LC_0005_Longest_Palindromic_Substring Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0005_Longest_Palindromic_Substring {

	public static void main(String args[]) {
		LC_0005_Longest_Palindromic_Substring obj = new LC_0005_Longest_Palindromic_Substring();
		String s = "a";
		String response = obj.longestPalindrome(s);
		System.out.println(response);
	}

	
	public String longestPalindrome(String s) {
        
        int start = 0;
        int end = 0;
        int max = 0;
        
        for(int i = 0; i < s.length(); ++i) {
            
            int even = checkPalindrome(s, i, i);
            int odd = checkPalindrome(s, i, i + 1);
            int m = Math.max(even, odd);
            if(m > max) {
                start = i - m + 1;
                end = i + m;
                max = m;
            }
        }
        return s.substring(start, end);
        
    }
    
    public int checkPalindrome(String s, int left, int right) {
        
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
        
    }
	
	
	public String longestPalindrome2(String s) {
		String response = "";
		int max = 0;
		for (int i = 0; i < s.length(); ++i) {
			for (int j = i; j < s.length(); ++j) {
				String sub = s.substring(i, j);
				if (isPalindrome(sub)) {
					if (max < sub.length()) {
						max = sub.length();
						response = sub;
					}
				}
			}
		}
		return response;
	}

	private boolean isPalindrome(final String sub) {
		for (int i = 0; i < sub.length() / 2; ++i) {
			if (sub.charAt(i) != sub.charAt(sub.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
