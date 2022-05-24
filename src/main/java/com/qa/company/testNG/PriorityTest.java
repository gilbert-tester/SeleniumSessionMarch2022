package com.qa.company.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = -10, enabled = false)
	public void aTest() {

		System.out.println("A test");

	}
	@Ignore
	@Test(priority = 0)
	public void bTest() {

		System.out.println("B test");

	}

	@Test(priority = -1)
	public void cTest() {

		System.out.println("C test");

	}

	@Test(priority = 1)
	public void dTest() {

		System.out.println("D test");

	}

	@Test(priority =10)
	public void eTest() {

		System.out.println("E test");

	}

	@Test(priority = 2)
	public void fTest() {

		System.out.println("F test");

	}

}
