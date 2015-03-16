package com.mamewo.sample.selenium_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class TestSimpleNG {
	@BeforeTest
	public void setUp(){
		System.out.println("before test");
	}

	@AfterTest
	public void tearDown(){
		System.out.println("after test");
	}

	@Test
	public void testSimple(){
		System.out.println("test!");
	}
}

