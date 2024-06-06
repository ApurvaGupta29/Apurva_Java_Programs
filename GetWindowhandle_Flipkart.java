package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.zeromq.ZStar.Set;

public class GetWindowhandle_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		e1.sendKeys("shoes");
		e1.sendKeys(Keys.ENTER);
		WebElement e2 = driver.findElement(By.linkText("Men's T-Shirts"));
		e2.click();
	Iterable<String> s1=	driver.getWindowHandles();
	System.out.println(s1);
	
		
	}

}
