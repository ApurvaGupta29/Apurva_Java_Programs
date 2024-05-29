package Selenium24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresence {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			WebElement search_tf = driver.findElement(By.name("q"));
		if (search_tf.isDisplayed()&&search_tf.isEnabled())	;
		{
		search_tf.sendKeys("India");
		Thread.sleep(5000);
		}

List<WebElement> auto_suggestion= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
int count=	auto_suggestion.size(); //show the size of colection or interface
	System.out.println(count);
	auto_suggestion.get(count-10).click();
	}

}
