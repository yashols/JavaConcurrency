package com.lc.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LC_0207 {

	public static void main(String[] args) {
		LC_0207 obj = new LC_0207();
		int[][] prerequisites = { { 0, 1 } };
		boolean result = obj.canFinish(2, prerequisites);
		System.out.println(result);
	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		Map<Integer, ArrayList<Integer>> courses = new HashMap<>();

		for (int[] p : prerequisites) {
			if (!courses.containsKey(p[0])) {
				courses.put(p[0], new ArrayList<Integer>());
			}
			courses.get(p[0]).add(p[1]);
		}

		int[] visited = new int[numCourses];

		for (int i = 0; i < numCourses; ++i) {
			if (checkCycle(i, visited, courses)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 1 = visited 2 = processing 0 = starting
	 * 
	 */
	private boolean checkCycle(int i, int[] visited, Map<Integer, ArrayList<Integer>> courses) {

		if (visited[i] == 2) {
			return true;
		}

		visited[i] = 2;
		if (!courses.containsKey(i)) {
			return false;
		}
		for (Integer neighbour : courses.get(i)) {
			if (visited[neighbour] == 2) {
				return false;
			}
			if (checkCycle(neighbour, visited, courses)) {
				return true;
			}
		}
		visited[i] = 1;
		return false;
	}

}
