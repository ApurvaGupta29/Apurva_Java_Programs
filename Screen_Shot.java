package Selenium24;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
				driver.findElement(By.name("q")).sendKeys("India");
				driver.findElement(By.name("btnK")).click();
				
				TakesScreenshot a1 =    driver;
				File source= a1.getScreenshotAs(OutputType.FILE);
			//	File destination = new File("C:\\Users\\apgupta\\Desktop\\Apurva github local\\Ram.png");
			File destination = new File("C:\\Users\\apgupta\\Desktop\\Apurva github local\\Ram"+Math.random()+".png");
			
				FileHandler.copy(source,destination);
				
	}

}
