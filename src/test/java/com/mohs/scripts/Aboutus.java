package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CommonFunctions;

public class Aboutus extends StartBrowser {
  @Test
  public void AboutusTestCase() throws Exception {
	  CommonFunctions  cfs=new CommonFunctions();
	  cfs.clickonAboutus();
	  Thread.sleep(6000);
  }
}
