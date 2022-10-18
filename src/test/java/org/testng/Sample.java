package org.testng;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	
	@BeforeSuite
	private void tc1() {
		System.out.println("test1");
		

	}
	@BeforeTest
	private void tc2() {
		System.out.println("test2");

	}
	@BeforeClass
	private void tc3() {
		System.out.println("test3");

	}
	@BeforeMethod
	private void tc4() {
		System.out.println("test4");
	

	}
	@BeforeGroups
	private void tc5() {
		System.out.println("test5");

	}
	@Test
	private void tc6() {
		System.out.println("test6");
	}
	@AfterSuite
	private void tc7() {
		System.out.println("test7");

	}
	@AfterTest
	private void tc8() {
		System.out.println("test8");

	}

}
