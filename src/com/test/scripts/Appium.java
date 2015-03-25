package com.test.scripts;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

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
			
			//Configuring APK File Path
			File appDir = new File("D:\\Kinnser-git\\KM\\client\\platforms\\android\\build\\outputs\\apk");
			File app = new File(appDir, "android-debug-unaligned.apk");

			//Android Desired Capabilities
			DesiredCapabilities capa = new DesiredCapabilities();

			capa.setCapability("deviceName","Galaxy Tab 3");
			capa.setCapability("automationName","Selendroid");
			capa.setCapability("platformName","Android");
			capa.setCapability("app", app.getAbsolutePath());
			capa.setCapability("appPackage", "com.kinnser.mobile");
			capa.setCapability("appActivity", "com.kinnser.mobile.KinnserMobile");

			//Stating the Application using appium driver

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capa);

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			//Switching the hybrid app in webview
			driver.switchTo().window("WEBVIEW");
			
			driver.findElement(By.id("username")).sendKeys("sadiq.shaik");
			driver.findElement(By.id("password")).sendKeys("Kinnser@123");
			driver.findElement(By.xpath("/html/body/ion-nav-view/ion-nav-view/ion-content/div[1]/div/form/div[2]/button")).click();
			
			ip.stopAppium();
			
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
