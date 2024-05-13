package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class HandleNotificationPopup {
	public static void main(String[] args) throws AWTException, InterruptedException{
		
	    	WebDriver driver = new ChromeDriver();
	    	// Navigate to the website
	        driver.get("https://www.cardekho.com/");
	        Thread.sleep(15000);
	        // Switch to the alert window
	       // driver.switchTo().alert();

	        // Use Robot class to handle system-level popups
	        
	        Actions actions = new Actions(driver);
	        actions.sendKeys(Keys.ESCAPE).build().perform();
	        System.out.println("ignored");
	        
	        driver.quit();
	    }
	}

