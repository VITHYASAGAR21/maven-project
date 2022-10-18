package org.testng;

import org.testng.annotations.Test;

public class HardAssert {
	@Test
	private void tc01() {
		String s="Jack";
		boolean contains = s.contains("J");
		Assert.assertTrue(contains);
		System.out.println(contains);
		
		

	}
	@Test
	private void tc02() {
		System.out.println("end");

	}

}
