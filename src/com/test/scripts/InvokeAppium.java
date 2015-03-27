package com.test.scripts;

import java.io.File;

public class InvokeAppium 
{
	static String appiumPath = "D:\\AutomationRnDWorkspace\\TestMobileAutomation\\src\\com\\test\\scripts\\startappium.bat";
	static File file = new File(appiumPath);
	Process appium;
	public void StartAppium()
	{
		System.out.println("Initiating appium launch");
		try
		{
			System.out.println("Verifying exe file");
			
			if (! file.exists()) 
			{
			   System.out.println("File not found in specified path");
			}
			else
			{
				System.out.println("Launching Application...");
				appium = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/C", "Start", file.getAbsolutePath()});
				Thread.sleep(10000);
				System.out.println("Appium Launched");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new IllegalArgumentException("The file " + appiumPath + " does not exist");
		}
	}
	
	public void stopAppium()
	{
		try
		{
			System.out.println("Stopping Appium");
			appium.exitValue();
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
			System.out.println("Appium Stoped");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
