package com.vodafone.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;
import com.vodafone.pages.DashboardPage;
import com.vodafone.pages.LoginPage;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validloginTest() {
		LoginPage loginPage = new LoginPage(driver);
		// username
		loginPage.enterUsername("Admin");
		// password
		loginPage.enterPassword("admin123");
		// login
		loginPage.clickOnLogin();
		// assert
		DashboardPage dashboardPage = new DashboardPage(driver);
		Assert.assertEquals(dashboardPage.getQuickLaunchText(), "Quick Launch");
	}

	@Test
	public void invalidloginTest() {
		LoginPage loginPage = new LoginPage(driver);
		// username
		loginPage.enterUsername("john");
		// password
		loginPage.enterPassword("admin1234");
		// login
		loginPage.clickOnLogin();
		// assert
		Assert.assertEquals(loginPage.getInvalidErrorMessage(), "Invalid credentials");
	}

}
