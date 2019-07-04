package com.selenium.test.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven1 
{
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","D:/driver/New folder/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://connect.maveric-systems.com/index.php/site/login");
		d.quit();
		System.out.println("Driver Run Successfull");
		System.out.println("Hello");
		
	}
}
