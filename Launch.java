package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
//EdgeDriver driver = new EdgeDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	//	System.out.println(driver.getWindowHandle());
	//	System.out.println(driver.getWindowHandles());
		driver.manage().window().maximize();
/*     driver.manage().window().minimize();
	//	Thread.sleep(20000);
		// driver.close();
	//	driver.quit();
	//	driver.getTitle();*/
		driver.findElement(By.name("q")).sendKeys("India");
driver.findElement(By.name("btnK")).click();
	//	driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	}

}
