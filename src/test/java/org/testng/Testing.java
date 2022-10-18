package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing{
	@Test
	private void tc01() {
		String s="jack";
		boolean contains = s.contains("l");
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(contains);
		System.out.println(contains);

	}
	@Test
	private void tc02() {
		System.out.println("end");

	}

}
