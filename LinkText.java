package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in");
WebElement Gmail_Link=driver.findElement(By.linkText("Gmail"));
Gmail_Link.click();
driver.getTitle();

	}

}
