package mmo.utils.nzz_download;

import org.testng.annotations.*;


public class Download_NZZ_Test 
{
	@BeforeMethod
	public void setUpBrowser() {
		// ...
	}

	@Test
	public void loadLastCT() {
		// you can enter your actual credentials here for testing. The defaults just 
		// cause the browser to open but will not allow to do any actual download 
		Download_NZZ.main(new String[] { "-u", "yourUserIdHere", 
		                                 "-p", "yourPwdHere",
		                                 "-t", "C:\\temp\\" 
		                              });
	}

	@AfterMethod
	public void closeBrowser() {
		// ...
	}
}