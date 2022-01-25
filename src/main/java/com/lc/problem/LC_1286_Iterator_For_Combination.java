package com.lc.problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_1286_Iterator_For_Combination {
	
	public static void main(String args[]) {
		CombinationIterator itr = new CombinationIterator("abc", 2);
		itr.next();    // return "ab"
		itr.hasNext(); // return True
		itr.next();    // return "ac"
		itr.hasNext(); // return True
		itr.next();    // return "bc"
		itr.hasNext(); // return False
		
	}

}


class CombinationIterator {

	
	Queue<String> queue = new LinkedList<>();
	
    public CombinationIterator(String characters, int combinationLength) {
    	generateCombination(characters, combinationLength, new ArrayList<>(), 0);
    }
    
    private void generateCombination(String characters, int combinationLength, List<String> list, int index) {
    	if(list.size() == combinationLength) {
    		StringBuffer sb = new StringBuffer(combinationLength);
    		for(String l : list) {
    			sb.append(l);
    		}
    		queue.add(sb.toString());
    		return;
    	}
		for(int i = index; i < characters.length(); ++i) {
			list.add(""+characters.charAt(i));
			generateCombination(characters, combinationLength, list, i+1);
			list.remove(list.size() - 1);
		}
	}

	public String next() {
    	if(!queue.isEmpty()) {
    		return queue.poll();
    	}
    	return "";
    }
    
    public boolean hasNext() {
    	return queue.isEmpty();
    }
}