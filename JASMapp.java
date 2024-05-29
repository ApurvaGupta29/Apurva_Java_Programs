package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JASMapp {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/apgupta/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("Relegion"));
Select s1 = new Select(e1);
s1.selectByIndex(2);
	}

}
