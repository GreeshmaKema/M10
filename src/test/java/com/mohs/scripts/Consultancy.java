package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CommonFunctions;

public class Consultancy extends StartBrowser{
  @Test
  public void ConsultancyTestCase() throws Exception {
	  CommonFunctions  cfs=new CommonFunctions();
	  cfs.clickonConsultancy();
	  Thread.sleep(5000);
  }
}
