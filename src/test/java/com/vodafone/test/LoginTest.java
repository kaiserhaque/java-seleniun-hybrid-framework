package com.vodafone.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper{
	@Test
	public void validloginTest(){
		driver.findElement(By.name("username")).sendKeys("Admin");
		//password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//login
		driver.findElement(By.xpath("//button[normalize-space(@type)='submit']")).click();
		//assert
		String msg = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick Launch')]")).getText();
		Assert.assertEquals(msg, "Quick Launch");
	}
	
	@Test
	public void invalidloginTest(){
		driver.findElement(By.name("username")).sendKeys("Admin");
		//password
		driver.findElement(By.name("password")).sendKeys("password123");
		//login
		driver.findElement(By.xpath("//button[normalize-space(@type)='submit']")).click();
		//assert
		String msg = driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid credentials')]")).getText();
		Assert.assertEquals(msg, "Invalid credentials");
	}

}
