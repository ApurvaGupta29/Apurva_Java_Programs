package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	WebElement Partial_Link=driver.findElement(By.partialLinkText("Best"));
Partial_Link.click();

WebElement Partial_Link1=driver.findElement(By.partialLinkText("Safari Pentagon 55"));
Partial_Link1.click();

	}

}
