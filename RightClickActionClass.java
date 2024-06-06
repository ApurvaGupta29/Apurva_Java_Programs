package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement PopUP = driver.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(driver);		
		//a1.contextClick(PopUP).perform();
		a1.doubleClick(PopUP).perform();
	}

}
