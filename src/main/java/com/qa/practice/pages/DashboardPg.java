package com.qa.practice.pages;

import org.testng.annotations.Test;

public class DashboardPg {

	@Test
	public void dashboardPgTest() {
		System.out.println("Checking Login Page");
	}

	@Test
	public void TitleTest() {
		System.out.println("Checking Title");
	}

	@Test(priority = Integer.MAX_VALUE)
	public void urlTest() {
		System.out.println("Checking Url");
	}
}
