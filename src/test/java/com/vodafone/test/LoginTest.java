package com.vodafone.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;
import com.vodafone.pages.DashboardPage;
import com.vodafone.pages.LoginPage;
import com.vodafone.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void validloginTest(String username, String password, String expectedOutput) {
		LoginPage loginPage = new LoginPage(driver);
		// username
		loginPage.enterUsername(username);
		// password
		loginPage.enterPassword(password);
		// login
		loginPage.clickOnLogin();
		// assert
		DashboardPage dashboardPage = new DashboardPage(driver);
		Assert.assertEquals(dashboardPage.getQuickLaunchText(), expectedOutput);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void invalidloginTest(String username, String password, String expectedErro) {
		LoginPage loginPage = new LoginPage(driver);
		// username
		loginPage.enterUsername(username);
		// password
		loginPage.enterPassword(password);
		// login
		loginPage.clickOnLogin();
		// assert
		Assert.assertEquals(loginPage.getInvalidErrorMessage(), expectedErro);
	}
	

}
