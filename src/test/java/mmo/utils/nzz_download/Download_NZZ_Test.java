/**
 * Copyright © 2024-2025 by Michael Moser
 * Released under GPL V3 or later
 *
 * @author mmo / Michael Moser / 17732576+mmoser18@users.noreply.github.com
 */

package mmo.utils.nzz_download;

import org.testng.annotations.*;


public class Download_NZZ_Test 
{
	@BeforeMethod
	public void setUpBrowser() {
		// ...
	}

	// @Test
	public void loadLastNZZ() {
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