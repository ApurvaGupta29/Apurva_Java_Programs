package Selenium24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Growtech_dropdown_practice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		Thread.sleep(2000);
WebElement Demo2 = driver.findElement(By.id("Choice1"));
Select s1 = new Select(Demo2);
s1.selectByVisibleText("Demo2");

WebElement practice1 = driver.findElement(By.id("Choice2"));
Select s2 = new Select(practice1);
s2.selectByValue("practice1");

/*List<WebElement> dropdowns = driver.findElements(By.tagName("select"));
Select s3 = new Select((WebElement) dropdowns);
s3.selectByVisibleText("Demo2");
s3.selectByValue("practice1");*/
	} 

}
