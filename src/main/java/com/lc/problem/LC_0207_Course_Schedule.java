package com.lc.problem;

import java.util.HashMap;
import java.util.Map;

public class LC_0207_Course_Schedule {

	public static void main(String args[]) {
		LC_0207_Course_Schedule obj = new LC_0207_Course_Schedule();
		int[][] prerequisites = {{1,0}, {0,1}};
		//int[][] prerequisites = {{1,0}};
		obj.canFinish(2, prerequisites);
	}
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses == 1) {
            return true;
        }
        Map<Integer, Boolean> coursePossible = new HashMap<Integer, Boolean>();
        for(int c = 0; c < numCourses; ++c) {
            boolean doable = isDoable(c, prerequisites, coursePossible);
            if(!doable) {
            	return false;
            }
        }
        return true;
    }

	private boolean isDoable(int c, int[][] prerequisites, Map<Integer, Boolean> coursePossible) {
		
		if(coursePossible.containsKey(c)) {
			return coursePossible.get(c);
		}
		for(int i = 0; i < prerequisites.length; ++i) {
			int[] courseCheck = prerequisites[i];
			if(courseCheck[0] == c) {
				Boolean check = isDoable(courseCheck[1], prerequisites, coursePossible);
				coursePossible.put(courseCheck[0], check);
				if(!check) {
					return false;
				}
			}
		}
		return true;
	}
	
}
