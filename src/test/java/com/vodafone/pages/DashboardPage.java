package com.vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	private By quickLaunchLocator = By.xpath("//p[contains(normalize-space(),'Quick Launch')]");

	
private WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	public String getQuickLaunchText() {
		String msg = driver.findElement(quickLaunchLocator).getText();
		return msg;
	}
	

}
