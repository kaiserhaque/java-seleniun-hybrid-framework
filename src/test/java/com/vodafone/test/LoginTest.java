package com.vodafone.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper{
	@Test
	public void validloginTest(){
		driver.findElement(By.name("username")).sendKeys("Admin");
		//password
		//login
		//assert
		
	}

}
