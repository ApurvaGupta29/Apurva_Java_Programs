package Selenium24;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
				driver.findElement(By.name("q")).sendKeys("Rabbit");
				Thread.sleep(2000);
				driver.findElement(By.name("btnK")).click();
				Thread.sleep(2000);
				TakesScreenshot a1 =    driver;
				File source= a1.getScreenshotAs(OutputType.FILE);
			Date d1 = new Date();
			Date d2 = new Date(d1.getTime());
			String date = d2.toString();
			String date1 = date.replace(":", "_");
			System.out.println(date1);
			
		//	File destination = new File("C:\\Users\\apgupta\\eclipse-workspace\\Selenium2024\\Screen_Shot\\Geeta.png");
	//		File destination = new File("C:\\Users\\apgupta\\Desktop\\Apurva github local\\Ram"+Math.random()+".png");
			File destination = new File("C:\\Users\\apgupta\\Desktop\\Apurva github local\\Test"+date1+".png");
				FileHandler.copy(source,destination);
				
				
	}

	private static String concat(String date1) {
		// TODO Auto-generated method stub
		return null;
	}

}
