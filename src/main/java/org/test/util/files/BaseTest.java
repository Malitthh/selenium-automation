package org.test.util.files;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.test.pages.PG_Login;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public static TakesScreenshot ts;
	public static WebDriver driver;
	public ExtendReports extend;
	public ConfigDataProvider config;
	protected CommonActions ca;
	protected PG_Login login;

	public String user;
	public String password;

	public BaseTest() {
		config = new ConfigDataProvider();
	}

	@BeforeMethod
	public void SetupSuite() throws InterruptedException {
		// Using Config File
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		ca = new CommonActions(driver);
		driver.get("url");
		driver.manage().window().maximize();

		// Using Excel File
		// ...

		Reporter.log("Trying to Start Browser & getting application ready", true);
		// driver = BrowserFactory.StartApplication(driver, Config.getBrowser(),
		// config.getQAURL);
		Reporter.log("Browser & application is up & running", true);

		System.out.println("BeforeMethod");
		System.out.println(user);
		System.out.println(password);

		// Uncomment the following lines if needed
		// String password = config.getPassword();
		// login = new PG_Login(driver, user, password);
		// ...

	}

	public static String getScreenShotpath(String tcName, WebDriver driver) throws IOException {
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + tcName + ".png";
		ts = ((TakesScreenshot) driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}

	public void printScreenshot(ITestResult result) {
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

			String methodName = result.getName();
			// Screenshot s = new
			// Ashot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			String destPath = "c:\\projects\\" + methodName + "_" + formatter.format(calendar.getTime()) + ".png";
			// ImageIO.write(s.getImage(), "PNG", new File(destPath));
			// Reporter.log("<a href='" + destpath + "'><img src='" + destpath + "'
			// height='100'
			// width='100'/> </a>");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void Cleanup() {
		driver.quit();
	}
}
