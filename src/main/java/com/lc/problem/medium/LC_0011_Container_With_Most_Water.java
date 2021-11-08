package com.lc.problem.medium;

/**
 * LC_0011_Container_With_Most_Water Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0011_Container_With_Most_Water
{

	public static void main(String args[]) {
		LC_0011_Container_With_Most_Water obj = new LC_0011_Container_With_Most_Water();
		int[] height = {1,8,6,2,5,4,8,3,7};
		obj.maxArea(height);
	}

	public int maxArea(int[] height) {
		int maxArea = 0;
		for(int i=0; i<height.length; ++i) {
			for(int j=i; j<height.length; ++j) {
				int h = Math.min(height[i], height[j]);
				int w = j - i;
				int area = h * w;
				maxArea = Math.max(maxArea, area);
			}
		}
		return maxArea;
	}

}
