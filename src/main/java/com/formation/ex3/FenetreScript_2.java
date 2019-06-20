package com.formation.ex3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FenetreScript_2 {
	public static void main(String[] args) {
		//path of chrome driver
		String chromeDriverPath = "C:/tmp/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		// appel fonction
		activityLesson02AutomationScript();
	}

private static void activityLesson02AutomationScript() {
	//chargement driver
	WebDriver webBrowser = new ChromeDriver();
		try {
			webBrowser.get("https://www.google.com");
			
			webBrowser.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
			webBrowser.manage().window().setSize(new Dimension(300, 500));
			
			webBrowser.manage().window().maximize();
			
			webBrowser.manage().window().setSize(new Dimension(300, 500));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// on quite dans tous les cas
			webBrowser.quit();
		}
	}
}
