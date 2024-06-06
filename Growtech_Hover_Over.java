package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Growtech_Hover_Over {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		WebElement e1 = driver.findElement(By.xpath("//div[@class='toolrip4'][1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
WebElement e2 = driver.findElement(By.linkText("Practice3"));
	e2.click();

	}

}
