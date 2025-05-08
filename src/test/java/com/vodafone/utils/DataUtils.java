package com.vodafone.utils;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public Object[][] invalidLoginData()
	{
		Object[][] objects = new Object[2][3];
		objects[0][0]="john";
		objects[0][1]="john123";
		objects[0][2]="Invalid credentials";
		
		objects[1][0]="saul";
		objects[1][1]="saul123";
		objects[1][2]="Invalid credentials";
		
		return objects;
	}


	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException{
		return ExcelUtils.getSheetIntoTwoDimensionalArray("test-data/orange-test-data.xlsx", mtd.getName());
	}
}
