package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	//	driver.get("https://www.google.com/");
		driver.navigate().refresh();
		((Object) driver).navigateto("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Ranbir");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	}

}
