package com.test.scripts;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Appium 
{
	
	public static void main(String[] args) 
	{
		AppiumDriver driver = null;
		try
		{
			InvokeAppium ip = new InvokeAppium();
			ip.StartAppium();
		
			System.out.println("Configuring Capabilities");
			
			//Configuring APK File Path
			File appDir = new File("C:\\Users\\sadiqs\\Desktop\\apk");
			File app = new File(appDir, "android-debug-unaligned.apk");

			//Android Desired Capabilities
			DesiredCapabilities capa = new DesiredCapabilities();

			
			capa.setCapability("automationName","Appium");
			capa.setCapability("platformName","Selendroid");
			capa.setCapability("deviceName","Samsung");
			capa.setCapability("app", app.getAbsolutePath());
			capa.setCapability("newCommandTimeout", 60);
			capa.setCapability("appPackage", "com.kinnser.link");
			capa.setCapability("appActivity", "MainActivity");
			

			//Stating the Application using appium driver
			System.out.println("Initiating App Launch");
		//	URI androidUri = new URI("http://127.0.0.1:4723/wd/hub");
		//	driver = new AppiumDriver(androidUri, capa TimeSpan.FromSeconds(180));
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capa);
			
			System.out.println("App launched");

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			//Switching the hybrid app in webview
		//	driver.switchTo().window("WEBVIEW");
			
		//	driver.context("WEBVIEW");
			
			Set<String> contextNames = driver.getContextHandles();
		    for (String contextName : contextNames)
		    {
		      System.out.println(contextName);
		      System.out.println("View: "+contextNames);
		      if (contextName.contains("WEBVIEW"))
		      {
		        driver.context(contextName);
		        System.out.println(contextName);
		      }
		      else
		    	  System.out.println("No webview available");
		    }
		    
			System.out.println("Login Attempt to app");
			driver.findElement(By.id("username")).sendKeys("sadiq.shaik");
			driver.findElement(By.id("password")).sendKeys("Kinnser@123");
			driver.findElement(By.xpath("/html/body/ion-nav-view/ion-nav-view/ion-content/div[1]/div/form/div[2]/button")).click();
			
			System.out.println("Login Successful");
			
		//	ip.stopAppium();
			
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
