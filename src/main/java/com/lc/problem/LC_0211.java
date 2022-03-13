package com.lc.problem;

import java.util.HashMap;
import java.util.Map;

public class LC_0211 {

	/*
	 * ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
	   [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
	 */
	public static void main(String[] args) {
		LC_0211 obj = new LC_0211();
		obj.addWord("bad");
		obj.addWord("dad");
		obj.addWord("mad");
		boolean result = obj.search("pad");
		System.out.println(result);
	}
	
	private Dictionary d;
    
    public LC_0211() {
        d = new Dictionary();
    }
    
    public void addWord(String word) {
        Dictionary node = d;
        for(char c : word.toCharArray()) {
            if(node.child.containsKey(c)) {
                node = node.child.get(c);
                continue;
            }
            node.child.put(c, new Dictionary());
            node.isWord = true;
        }
    }
    
    public boolean search(String word) {
        Dictionary node = d;
        for(char c : word.toCharArray()) {
            if(d.child.containsKey(c)) {
                continue;
            }
            return false;
        }
        return node.isWord;
    }
	
}

class Dictionary {
    public Map<Character, Dictionary> child = new HashMap<>();
    public boolean isWord = false;
}