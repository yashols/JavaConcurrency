package com.problems;

import org.junit.Assert;
import org.junit.Test;

public class LargestStringWithMax2CharsTest {

	@Test
	public void test1() {
		LargestStringWithMax2Chars obj = new LargestStringWithMax2Chars();
		String str = "aa";
		int response = obj.checkLength(str);
		Assert.assertEquals(0, response);
	}

	@Test
	public void test2() {
		LargestStringWithMax2Chars obj = new LargestStringWithMax2Chars();
		String str = "ab";
		int response = obj.checkLength(str);
		Assert.assertEquals(2, response);
	}

	@Test
	public void test3() {
		LargestStringWithMax2Chars obj = new LargestStringWithMax2Chars();
		String str = "";
		int response = obj.checkLength(str);
		Assert.assertEquals(0, response);
	}

	@Test
	public void test4() {
		LargestStringWithMax2Chars obj = new LargestStringWithMax2Chars();
		String str = "mmm";
		int response = obj.checkLength(str);
		Assert.assertEquals(0, response);
	}

	@Test
	public void test5() {
		LargestStringWithMax2Chars obj = new LargestStringWithMax2Chars();
		String str = "mnm";
		int response = obj.checkLength(str);
		Assert.assertEquals(3, response);
	}

	@Test
	public void test6() {
		LargestStringWithMax2Chars obj = new LargestStringWithMax2Chars();
		String str = "mnmmmabcamm";
		int response = obj.checkLength(str);
		Assert.assertEquals(5, response);
	}

	@Test
	public void test7() {
		LargestStringWithMax2Chars obj = new LargestStringWithMax2Chars();
		String str = "mnaababxm";
		int response = obj.checkLength(str);
		Assert.assertEquals(5, response);
	}

	@Test
	public void test8() {
		LargestStringWithMax2Chars obj = new LargestStringWithMax2Chars();
		String str = "mnmaaaaaaa";
		int response = obj.checkLength(str);
		Assert.assertEquals(8, response);
	}

}
