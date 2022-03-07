package com.mohs.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs.or. Homepage ;
import com.mohs.config.StartBrowser;
import com.mohs.wdcmds.ActionDriver;

public class CommonFunctions {
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public CommonFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	
		public void clickonAboutus() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Navigate to M10 website");
			aDriver.navigateToApplication("https://mohs10.io/");
			aDriver.click(Homepage.classAboutus, "click operarion on About ");			
	    }
		public void clickonConsultancy () throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Navigate to M10 website");
			aDriver.navigateToApplication("https://mohs10.io/");
			aDriver.mouseHover(Homepage.xpathServices, "Mousehover on services");
			aDriver.click(Homepage.lnkConsultancy, "click operarion on Consultancy");			
	    }
		public void clickonProductengg() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Navigate to M10 website");
			aDriver.navigateToApplication("https://mohs10.io/");
			aDriver.mouseHover(Homepage.xpathServices, "Mousehover on services");
			aDriver.click(Homepage.lnkProductengg, "click operarion on ProductEngg");			
	    }
}
