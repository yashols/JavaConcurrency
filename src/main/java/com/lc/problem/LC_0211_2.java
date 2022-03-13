package com.lc.problem;

import java.util.HashMap;
import java.util.Map;


class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean word = false;
    public TrieNode() {}
}

public class LC_0211_2 {
	
	public static void main(String[] args) {
		LC_0211_2 obj = new LC_0211_2();
		obj.addWord("bad");
		obj.addWord("dad");
		obj.addWord("bbo");
		boolean result = obj.search("pad");
		System.out.println(result);
	}
    TrieNode trie;

    /** Initialize your data structure here. */
    public LC_0211_2() {
        trie = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = trie;

        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                node.children.put(ch, new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.word = true;
    }
    
    /** Returns if the word is in the node. */
    public boolean searchInNode(String word, TrieNode node) {
        for (int i = 0; i < word.length(); ++i) {
            char ch = word.charAt(i);
            if (!node.children.containsKey(ch)) {
                // if the current character is '.'
                // check all possible nodes at this level
                if (ch == '.') {
                    for (char x : node.children.keySet()) {
                        TrieNode child = node.children.get(x);
                        if (searchInNode(word.substring(i + 1), child)) {
                            return true;
                        }
                    }
                }
                // if no nodes lead to answer
                // or the current character != '.'
                return false;
            } else {
                // if the character is found
                // go down to the next level in trie
                node = node.children.get(ch);
            }
        }
        return node.word;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchInNode(word, trie);
    }
}
