package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CommonFunctions;

public class ProductEngg extends StartBrowser {
  @Test
  public void ProductEnggTestCase() throws Exception{
	  CommonFunctions  cfs=new CommonFunctions();
	  cfs.clickonProductengg();
	  Thread.sleep(5000);
  }
}
