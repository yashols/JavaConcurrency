package com.lc.problem;

import java.util.LinkedList;

public class LC_0071 {

	public static void main(String[] args) {
		LC_0071 obj = new LC_0071();
		String path = "/../";
		obj.simplifyPath(path);
	}

	public String simplifyPath(String path) {
		LinkedList<String> linkedList = new LinkedList<>();
		for(String s : path.split("/")) {
			if(s.isEmpty() || ".".equals(s)) {
				continue;
			}
			if("..".equals(s)) {
				if(!linkedList.isEmpty()) {
					linkedList.removeLast();
				}
				continue;
			}
			linkedList.add(s);
		}
		StringBuffer sb = new StringBuffer();
		if(linkedList.isEmpty()) {
			return "/";
		}
		while(!linkedList.isEmpty()) {
			String s = linkedList.removeFirst();
			if(s.isEmpty() || ".".equals(s)) {
				continue;
			}
			sb.append("/"+s);
		}
		return sb.toString();
	}

}
