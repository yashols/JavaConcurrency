package com.lc.problem;

import java.util.ArrayList;
import java.util.List;

public class LC_1178_Number_Valid_Words_For_Each_Puzzle {

	public static void main(String[] args) {
		LC_1178_Number_Valid_Words_For_Each_Puzzle obj = new LC_1178_Number_Valid_Words_For_Each_Puzzle();
		String[] words = {"aaaa","asas","able","ability","actt","actor","access"};
		String[] puzzles = {"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
		List<Integer> response = obj.findNumOfValidWords(words, puzzles);
		for(int i : response) {
			System.out.print(i + " - > ");
		}
	}

	public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
		List<Integer> response = new ArrayList<Integer>();
		for (String puzzle : puzzles) {
			int matchedWords = 0;
			for (String word : words) {
				if(!word.contains(""+puzzle.charAt(0))) {
					continue;
				}
				if(!allCharsAvailable(puzzle, word)) {
					continue;
				}
				++matchedWords;
			}
			response.add(matchedWords);
		}
		return response;
	}

	private boolean allCharsAvailable(String puzzle, String word) {
		char[] chars = word.toCharArray();
		for(char c : chars) {
			if(!puzzle.contains(""+c)) {
				return false;
			}
		}
		return true;
	}

}
