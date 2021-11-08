package com.lc.problem.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * LC_0017_Letter_Combinations_Phone_Number Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0017_Letter_Combinations_Phone_Number
{

	public static void main(String args[]) {
		LC_0017_Letter_Combinations_Phone_Number obj = new LC_0017_Letter_Combinations_Phone_Number();
		List<String> response = obj.letterCombinations("234");
		for(String s : response) {
			System.out.print(s + " -> ");
		}
	}


	public List<String> letterCombinations(String digits) {
		Map<Character,Character[]> numbers = new HashMap<>();
		numbers.put('2',new Character[]{'a','b','c'});
		numbers.put('3',new Character[]{'d','e','f'});
		numbers.put('4',new Character[]{'g','h','i'});
		numbers.put('5',new Character[]{'j','k','l'});
		numbers.put('6',new Character[]{'m','n','o'});
		numbers.put('7',new Character[]{'p','q','r','s'});
		numbers.put('8',new Character[]{'t','u','v'});
		numbers.put('9',new Character[]{'w','x','y','z'});

		char[] inputs = digits.toCharArray();
		List<String> response = new ArrayList<>();
		for(char c : inputs) {
			List<String> res = new ArrayList<>();
			Character[] chars = numbers.get(c);
			if(response.isEmpty()) {
				for(Character c2: chars) {
					res.add(String.valueOf(c2));
				}
			} else {
				for(Character c3 : chars) {
					String c4 = String.valueOf(c3);
					for(String s : response) {
						res.add(s.concat(c4));
					}
				}
			}
			response.clear();
			response.addAll(res);
		}
		return response;
	}

}
