package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> linksList = driver.findElements(By.xpath("//div[text()='Get to Know Us']/following-sibling::ul//a"));
	
	for(WebElement footer : linksList) {
		
		String ls = footer.getText();
		System.out.println(ls);
	}

}
}
