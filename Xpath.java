package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/apgupta/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
	Thread.sleep(2000);
		WebElement HTML_pg= driver.findElement(By.xpath("(/html/body/input)[1]"));
	HTML_pg.sendKeys("Apurva");
	
	
	}

}
