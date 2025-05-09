package com.vodafone.base;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverKeyword {

	private WebDriver driver;

	public WebDriverKeyword(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnElement(By locator) {
		driver.findElement(locator).click();
	}

	public void typeOnElement(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public String getTextFromElement(By locator) {
		return driver.findElement(locator).getText();
	}

	public void switchTabByTitle(String title) {
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		for (String window : windows) {
			driver.switchTo().window(window);
			if (driver.getTitle().equals(title)) {
				break;
			}
		}
	}
}
