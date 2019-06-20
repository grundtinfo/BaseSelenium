package com.formation.ex2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationScript_1 {
	public static void main(String[] args) throws InterruptedException {
		//path of chrome driver
		String chromeDriverPath = "C:/tmp/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//chargement driver
		WebDriver webBrowser = new ChromeDriver();
		
		try {
			//chargement page
			webBrowser.get("https://www.google.com");
			webBrowser.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
			
			//verifier titre page
			if (webBrowser.getTitle().equalsIgnoreCase("google")) {
				System.out.println("Titre bien 'google'");
			} else {
				System.out.println("Titre n'est pas 'google'");
			}
			
			// naviguer vers Bing
			webBrowser.navigate().to("https://www.bing.com");
			if (webBrowser.getTitle().equalsIgnoreCase("bing")) {
				System.out.println("Titre bien 'bing'");
			} else {
				System.out.println("Titre n'est pas 'bing'");
			}
			
			//revenir sur google
			webBrowser.navigate().back();

			if (webBrowser.getTitle().equalsIgnoreCase("google")) {
				System.out.println("Titre bien 'google'");
			} else {
				System.out.println("Titre n'est pas 'google'");
			}
		} finally {
			// TODO: handle finally clause
			webBrowser.close();
		}
	}
}
