package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchShoes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Search= driver.findElement(By.xpath("(//input)[5]"));
				Search.sendKeys("Shoes");
				
				WebElement Search_Click= driver.findElement(By.xpath("(//input)[6]"));
				Search_Click.sendKeys(Keys.ENTER);
	}

}
