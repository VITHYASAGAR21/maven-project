package org.testng;


import org.testng.annotations.Test;

public class BasedOnpriority {
	
	@Test(priority=-3,invocationCount=20)
	private void tc1() {
		System.out.println("test1");
		

	}
	@Test(priority=-1,enabled=false)
	private void tc2() {
		System.out.println("test2");

	}
	@Test(priority=0)
	private void tc3() {
		System.out.println("test3");

	}
	@Test(priority=-7)
	private void tc4() {
		System.out.println("test4");
	

	}
	@Test(priority=3)
	private void tc5() {
		System.out.println("test5");

	}
	@Test(priority=9)
	private void tc6() {
		System.out.println("test6");
	}
	@Test(priority=4)
	private void tc7() {
		System.out.println("test7");

	}
	@Test(priority=-2)
	private void tc8() {
		System.out.println("test8");

	}


}
