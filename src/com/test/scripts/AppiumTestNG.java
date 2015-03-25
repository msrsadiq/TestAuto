package com.test.scripts;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AppiumTestNG 
{
	
	private WebDriver driver = new FirefoxDriver();
	
	/*@BeforeClass
	public void beforeMethod() 
	{
		try 
		{
			// set up appium
			File appDir = new File("{pathApk file}");
			File app = new File(appDir, "{APK file Name}"); //my case “demo1.apk”
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("device","Android");
			capabilities.setCapability(CapabilityType.BROWSER_NAME,  "");
			capabilities.setCapability(CapabilityType.VERSION, "4.2");
			capabilities.setCapability(CapabilityType.PLATFORM, "WINDOW");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("app-package", "{app package name}");  //my case com.gorillalogic.monkeytalk.demo1
			capabilities.setCapability("app-activity", ".{main activity class}");  //my case RootActivity
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				      
		
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		      
	}
	  
	@AfterClass
	public void afterMethod()
	{
		  driver.quit();
	}
	*/
	@Test
	public void oasisC1SOC() 
	{
		try
		{
			//Navigate to NewDocuments
			driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[3]/ion-header-bar/div[1]/span[1]/button")).click();
			driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu/ion-content/div[1]/div/a[3]")).click();
			
			//Open OASIS C1 SOC
			driver.findElement(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/div/div/a[2]")).click();
			//Fill Demographics
			driver.findElement(By.xpath("//*[@id='visit-record']/div/div/div[1]/div/div/div[1]/div[2]/div[2]/km-time-now/label/button")).click();
			driver.findElement(By.xpath("//*[@id='visit-record']/div/div/div[1]/div/div/div[2]/div[2]/div[2]/km-time-now/label/button")).click();
			driver.findElement(By.xpath("//*[@id='visit-record']/div/div/div[2]/div/div/div[1]/div/div[2]/km-date-today/label/button")).click();
			
			//Fill Endocrine
			driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[3]/ion-header-bar/div[1]/span[1]/button")).click();
			driver.findElement(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu/ion-content/div[1]/div/div/div[10]/a")).click();
			
			driver.findElement(By.id("endocrine-wnl")).click();
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[3]/div/div[2]/div/div/div/div/label[1]/div")).click();
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[4]/div/div[2]/div/div/div/div/label[1]/div")).click();
			driver.findElement(By.id("rendocrine-insuling-dependent-text")).sendKeys("For Five Months");;
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[6]/div/div[2]/div/div/div/div/label[2]/div")).click();
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[7]/div/div[2]/div/div/div/div/label[2]/div")).click();
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[8]/div/div[2]/div/div/div/div/label[1]/div")).click();
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[9]/div/div[2]/div/div/div/div/label[2]/div")).click();
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[10]/div/div[2]/div/div/div/div/label[3]/div")).click();
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[11]/div/div[2]/div/div/div/div/label[1]/div")).click();
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[12]/div/div[2]/div/div/div/div/label[1]/div")).click();
			driver.findElement(By.id("endocrine-polyuria")).click();
			driver.findElement(By.id("endocrine-polyphagia")).click();
			driver.findElement(By.id("endocrine-radiculopathy")).click();
			driver.findElement(By.id("endocrine-polydipsia")).click();
			driver.findElement(By.id("endocrine-polyphagia")).click();
			driver.findElement(By.id("endocrine-thyroid-problems")).click();
			driver.findElement(By.id("endocrine-blood-sugar-text")).sendKeys("220");
			driver.findElement(By.xpath("//*[@id='endocrine-table']/div/div[14]/div[1]/div/ul/li[2]/div/div/label[2]/div")).click();
			driver.findElement(By.id("endocrine-blood-sugar-checked-by-text")).sendKeys("Blood Sugar test report");;
			driver.findElement(By.id("endocrine-site-text")).sendKeys("Site Analysis");;
			driver.findElement(By.id("endocrine-comments")).sendKeys("Endocrine Comments");;
			
			driver.findElement(By.id("endocrine-intervention-diabetic-management")).click();
			Select s1 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-interventions']/div/div[1]/div/div/div[1]/div/select")));
			s1.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-intervention-feet-report")).click();
			Select s2 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-interventions']/div/div[1]/div/div/div[2]/div/div/div/select")));
			s2.selectByIndex(1);
			
			driver.findElement(By.id("endocrine-intervention-wash-feet")).click();
			Select s3 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-interventions']/div/div[1]/div/div/div[3]/div/div/div/select")));
			s3.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-intervention-moisture-toes")).click();
			Select s4 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-interventions']/div/div[1]/div/div/div[4]/div/div/div/select")));
			s4.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-intervention-change-socks")).click();
			
			driver.findElement(By.id("endocrine-intervention-file-toes")).click();
			Select s5 = new Select(driver.findElement(By.xpath("")));
			s5.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-intervention-barefoot")).click();
			Select s6 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-interventions']/div/div[1]/div/div/div[7]/div/div/div/select")));
			s6.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-intervention-elevate-feet")).click();
			Select s7 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-interventions']/div/div[1]/div/div/div[8]/div/div/div/select")));
			s7.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-intervention-protect-feet")).click();
			Select s8 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-interventions']/div/div[1]/div/div/div[9]/div/div/div/select")));
			s8.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-intervention-cut-calluses")).click();
			Select s9 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-interventions']/div/div[1]/div/div/div[10]/div/div/div/select")));
			s9.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-intervention-finger-stick")).click();
			
			driver.findElement(By.id("endocrine-intervention-juice")).click();
			driver.findElement(By.id("endocrine-intervention-juice-blood-sugar-level")).sendKeys("121");
			driver.findElement(By.id("endocrin-interventione-juice-blood-sugar-level-remains")).sendKeys("152");
			
			driver.findElement(By.id("endocrin-interventione-insuli-freq")).click();
			driver.findElement(By.id("endocrine-intervention-insulin-type")).sendKeys("test1");
			driver.findElement(By.id("endocrine-intervention-insulin-freq-text")).sendKeys("test2");
			
			driver.findElement(By.id("endocrine-intervention-assess-sugar")).click();
			
			driver.findElement(By.id("endocrine-intervention-insulin-prefill")).click();
			driver.findElement(By.id("endocrine-intervention-insulin-syringe-type")).sendKeys("test3");
			driver.findElement(By.id("endocrine-intervention-insulin-syringe-freq-text")).sendKeys("test4");
			
			driver.findElement(By.id("endocrine-intervention-inspect-extremeties")).click();
			
			driver.findElement(By.id("endocrine-intervention-additional-orders")).click();
			
			driver.findElement(By.id("endocrine-goals-fasting-blood-sugar")).click();
			driver.findElement(By.id("endocrine-goals-fasting-level1")).sendKeys("458");
			driver.findElement(By.id("endocrine-goals-fasting-level2")).sendKeys("221");
			
			driver.findElement(By.id("endocrine-goals-random-blood-sugar")).click();
			driver.findElement(By.id("endocrine-goals-random-level1")).sendKeys("124");
			driver.findElement(By.id("endocrine-goals-random-level2")).sendKeys("146");
			
			driver.findElement(By.id("endocrine-goals-hypo-symptoms")).click();
			
			driver.findElement(By.id("endocrine-goals-gluco-independent")).click();
			Select s10 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-goals']/div/div[4]/div/div/div/select")));
			s10.selectByIndex(2);
			driver.findElement(By.id("endocrine-goals-independent-date")).click();
			driver.findElement(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")).click();
			
			
			driver.findElement(By.id("endocrine-goals-skin-conditions")).click();
			Select s11 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-goals']/div/div[5]/div/div/div/select")));
			s11.selectByIndex(2);
			
			driver.findElement(By.id("endocrine-goals-insulin-admin-independent")).click();
			Select s12 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-goals']/div/div[6]/div/div/div/select")));
			s12.selectByIndex(2);
			driver.findElement(By.id("endocrine-goals-insulin-admin-independent-date")).click();
			driver.findElement(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")).click();

			
			driver.findElement(By.id("endocrine-goals-diabetic-foot-care")).click();
			Select s13 = new Select(driver.findElement(By.xpath("//*[@id='endocrine-goals']/div/div[7]/div/div/div/select")));
			s13.selectByIndex(2);
			driver.findElement(By.id("endocrine-goals-diabetic-foot-care-date")).click();
			driver.findElement(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")).click();

			
			
			
		//	driver.findElement(By.xpath("")).click();
		//	driver.findElement(By.id("")).click();
		//	Select s = new Select(driver.findElement(By.xpath("")));
			
			//Navigate to Documents
			driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[3]/ion-header-bar/div[1]/span[1]/button")).click();
			driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu/ion-content/div[1]/div/a[2]")).click();
			
			//Validate if a task is created
			String temp = driver.findElement(By.xpath("//*[@id='cogHolder']/ul/li/a/div")).getText();
			if(temp.contains("OASIS-C1 Start of Care"))
			{
				System.out.println("OASIS C1 SOC Saved");
			}
			else
			{
				System.out.println("Task not saved");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		  
	}
	  
			
	@BeforeTest
	public void loginKL() 
	{
		try
		{
			driver.get("http://192.168.28.113:8100/#/login");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("sadiq.shaik");
			driver.findElement(By.id("password")).sendKeys("Kinnser@123");
			driver.findElement(By.xpath("/html/body/ion-nav-view/ion-nav-view/ion-content/div[1]/div/form/div[2]/button")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void logoutKL()
	{
		try
		{
			  driver.findElement(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[3]/span[1]/div")).click();
			  driver.quit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		  
	}

}
