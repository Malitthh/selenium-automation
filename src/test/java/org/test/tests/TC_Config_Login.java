package org.test.tests;

import org.test.util.files.BaseTest;

@Listners (TestNGListners.class)
public class TC_Config_Login extends BaseTest{
	@Test(description = "Login TC")
	//using config
	public void Test()throws InterruptedException {
		
		String filepath2 = System.getProperty("user.dir");
		String ss = filepath2+ "\\excels_Testdata\\Testdata.xlsx";
		ExcelReader exceldata2 = new ExcelReader(ss,"SheetName");
		
		String u = exceldata2.getCellData(1,1); // Row & Column
		String pw = exceldata2.getCellData(1,2);
		login.login(u,pw);
		
		
	}

}
