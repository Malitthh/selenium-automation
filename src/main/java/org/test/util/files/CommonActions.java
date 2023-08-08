package org.test.util.files;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonActions {

    public WebDriver driver;

    public CommonActions(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void enterText(String text, By textobj) {
        driver.findElement(textobj).sendKeys(text);
    }

    public void tab() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).build().perform();
    }

    public String generateRandomNumber() {
        String numbers = "123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 13;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(numbers.length());
            char randomchar = numbers.charAt(index);
            sb.append(randomchar);
        }
        String randomString = sb.toString();
        System.out.println("Random: " + randomString);
        return randomString;
    }
    
    /*public void warningMessage() {
    	
    	List<WebElement> wtxt = driver.findElements(WarningTxt);
    	if (wtxt.size()!=0) {
    		
    		driver.findElement(ButtonName).click();
    		Thread.sleep(7000);
    		System.out.println("Button Clicked");
    	}else {
    		System.out.println("Message didn't appear");
    	}
    }*/
}
