package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_program {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/apgupta/Desktop/HTML/learningHTML.html");
			driver.manage().window().maximize();
			
			WebElement male_rdio = driver.findElement(By.id("123"));
	boolean b1=	male_rdio.isSelected();
			if (b1==true)	
		{
		System.out.println("is Selected");
		}
		else
		{
			System.out.println("not selected");	
		}
male_rdio.click();
System.out.println("Selected");

	}

}
