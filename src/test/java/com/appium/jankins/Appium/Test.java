package com.appium.jankins.Appium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());

	}

}
