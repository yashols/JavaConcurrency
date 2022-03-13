package com.lc.problem;

public class LC_0165 {

	public static void main(String[] args) {
		LC_0165 obj = new LC_0165();
		int result = obj.compareVersion("1.0.1", "1");
		System.out.println(result);
	}

	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int l1 = 0;
		int l2 = 0;
		while (l1 < v1.length && l2 < v2.length) {
			int n1 = Integer.parseInt(v1[l1]);
			int n2 = Integer.parseInt(v2[l2]);
			if(n1 < n2) {
				return -1;
			}
			if(n1 > n2) {
				return 1;
			}
			++l1;
			++l2;
		}
		if(l1 == 0 && l2 == 0) {
			return 0;
		}
		if(l1 == v1.length) {
			while(l2 < v2.length) {
				if(Integer.parseInt(v2[l2]) > 0) {
					return -1;
				}
				++l2;
			}
		}
		if(l2 == v2.length) {
			while(l1 < v1.length) {
				if(Integer.parseInt(v1[l1]) > 0) {
					return 1;
				}
				++l1;
			}
		}
		return 0;
	}

}
