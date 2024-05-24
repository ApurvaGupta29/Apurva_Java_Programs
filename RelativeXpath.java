package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/apgupta/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
	Thread.sleep(2000);
		WebElement HTML_pg= driver.findElement(By.xpath("(//input)[3]"));
	HTML_pg.sendKeys("Apurva");
	
	}

}
