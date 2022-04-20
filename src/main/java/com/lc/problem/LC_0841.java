package com.lc.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class LC_0841 {

	public static void main(String[] args) {
		LC_0841 obj = new LC_0841();

		List<List<Integer>> rooms = new ArrayList<>();
		rooms.add(new ArrayList<>(Arrays.asList(1)));
		rooms.add(new ArrayList<>(Arrays.asList(2)));
		rooms.add(new ArrayList<>(Arrays.asList(3)));
		rooms.add(new ArrayList<>());
		boolean result = obj.canVisitAllRooms(rooms);
		System.out.println(result);
	}

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		boolean[] visits = new boolean[rooms.size()];
		List<Integer> keys = rooms.get(0);
		Queue<Integer> queue = new LinkedList<>();
		visits[0] = true;
		for (int i = 0; i < keys.size(); ++i) {
			queue.add(keys.get(i));
		}
		while(!queue.isEmpty()) {
			int room = queue.poll();
			visits[room] = true;
			List<Integer> moreKeys = rooms.get(room);
			for (int i = 0; i < moreKeys.size(); ++i) {
				if(!visits[moreKeys.get(i)]) {
					queue.add(moreKeys.get(i));
					visits[moreKeys.get(i)] = true;
				}
			}
		}
		for (int i = 0; i < visits.length; ++i) {
			if(!visits[i]) {
				return false;
			}
		}
		return true;
	}

}
