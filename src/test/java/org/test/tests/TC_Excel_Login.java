package org.test.tests;

import org.test.util.files.BaseTest;

@Listners (TestNGListners.class)
public class TC_Excel_Login extends BaseTest{
	@Test(description = "Login TC")
	//using config
	public void Test()throws InterruptedException {
		
		login.login(config.getuser(), config.getpassword);
		
		
	}

}