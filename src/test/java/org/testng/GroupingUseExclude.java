package org.testng;

import org.testng.annotations.Test;

public class GroupingUseExclude {
	@Test(groups="Smoke")
	private void tc01() {
		Assert.assertTrue(false);
		System.out.println("test 1:smoke");

	}
	@Test(groups="Sanitty",dependsOnGroups="Smoke")
	private void tc02() {
		System.out.println("test 2:Sanitty");

	}
	@Test(groups="Regg",dependsOnMethods="tc01")
	private void tc03() {
		System.out.println("test 3:Regg");

	}
	@Test(groups="Smoke")
	private void tc04() {
		System.out.println("test 4:Smoke");

	}
	@Test(groups="Sanitty")
	private void tc05() {
		System.out.println("test 5:Sanitty");

	}
	@Test(groups="Smoke")
	private void tc06() {
		System.out.println("test 6:Smoke");

	}
	

}
