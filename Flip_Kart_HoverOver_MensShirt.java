package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flip_Kart_HoverOver_MensShirt {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2 = driver.findElement(By.linkText("Men's T-Shirts"));
		e2.click();
		

	}

}
