package com.appium.jankins.Appium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testclass {
	
	
	@Test

	public void start() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println("333333333333333333333333333");
		
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();

	}

}
