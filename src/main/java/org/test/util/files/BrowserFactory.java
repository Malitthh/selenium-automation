package org.test.util.files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver StartApplication(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--test-type");
			option.addArguments("--disable-extensions");
			option.addArguments("--disable-dev-shm-usage");
			driver = new ChromeDriver(option);
		} else if (browserName.equals("FireFox")) {

		} else {
			System.out.println("We do not support this browser");
		}

		driver.manage().timeouts().pageLoadTimeout(420, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(420, TimeUnit.SECONDS);
		return driver;
	}

	public static void QuitBrowser(WebDriver driver) {
		driver.quit();
	}
}
