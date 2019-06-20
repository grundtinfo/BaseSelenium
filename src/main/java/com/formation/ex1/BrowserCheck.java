package com.formation.ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCheck {
	public static void main(String[] args) throws InterruptedException {
		//path of chrome driver
		String chromeDriverPath = "C:/tmp/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//chargement driver
		WebDriver webBrowser = new ChromeDriver();
		
		Thread.sleep(2500);
		
		webBrowser.close();
	}
}
