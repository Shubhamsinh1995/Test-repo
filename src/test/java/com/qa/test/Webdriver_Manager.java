package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Manager {

	public static void main(String[] args) {
		
	//	WebDriverManager.firefoxdriver().setup();
	//	WebDriver driver=new FirefoxDriver();
		
	   WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
          
		driver.get("https://www.youtube.com/");
	}

}
