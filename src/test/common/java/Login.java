package test.common.java;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login
{
	WebDriver driver = new FirefoxDriver();
	
	@Before
	public void openBrowser()
	{
		
		driver.get("http://192.168.28.113:8100/#/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void initialLogin()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("Shaik.Sadiq");
			driver.findElement(By.id("password")).sendKeys("Kinnser@123");
			driver.findElement(By.xpath("html/body/ion-nav-view/ion-nav-view/ion-content/div[1]/div/form/div[2]/button")).click();
			
			System.out.println("Login Test case Passed");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void aideSupervisoryVisit()
	{
		//Login
		driver.findElement(By.id("username")).sendKeys("Shaik.Sadiq");
		driver.findElement(By.id("password")).sendKeys("Kinnser@123");
		driver.findElement(By.xpath("html/body/ion-nav-view/ion-nav-view/ion-content/div[1]/div/form/div[2]/button")).click();
		System.out.println("Login Successful");
		
		//String s = driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[3]/ion-header-bar/div[2]")).getText();
		//assertTrue(driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[3]/ion-header-bar/div[2]")).getText().contains("Hotbox"));
		
		//Open Side Menu
		driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[3]/ion-header-bar/div[1]/span[1]/button")).click();
		
		//Navigate to New Documents Page
		driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu/ion-content/div[1]/div/a[3]")).click();
		
		System.out.println("Navigated to new documents page");
		
		//Open HHA
		driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/div/div/a[3]")).click();
		
		System.out.println("HHA successfully opened");
		
		//Enter Patient First Name and Last Name
		driver.findElement(By.xpath("//*[@id='Patient Name']/div/div/div/div/div[1]/div/label/input")).sendKeys("First Name");
		driver.findElement(By.xpath("//*[@id='Patient Name']/div/div/div/div/div[3]/div/label/input")).sendKeys("Last Name");
		System.out.println("Entered patient name");
		
		//Enter Time In Time Out Visit Date and Associated Mileage.
		driver.findElement(By.xpath("//*[@id='Visit Record']/div/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/km-time-now/label/button")).click();
		driver.findElement(By.xpath("//*[@id='Visit Record']/div/div[1]/div[2]/div/div/div[1]/div/div[2]/km-date-today/label/button")).click();
		driver.findElement(By.xpath("//*[@id='Visit Record']/div/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id='Visit Record']/div/div[1]/div[2]/div/div/div[2]/div/input")).sendKeys("5");
		System.out.println("Logged visit details");
		
		//Open Side Menu
		driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[3]/ion-header-bar/div[1]/span[1]/button")).click();
		
		//Navigate to Documents Page
		driver.findElement(By.xpath("html/body/ion-nav-view/ion-side-menus/ion-side-menu/ion-content/div[1]/div/a[2]")).click();
		System.out.println("Successfully navigated to login page");
		
		System.out.println("HHA test case passed");
		
	}
	
	@After
	public void logout()
	{
		driver.quit();
	}
	

}


	
	

