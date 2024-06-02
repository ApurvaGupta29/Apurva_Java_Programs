package Selenium24;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Sug_SearchShoes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Search= driver.findElement(By.xpath("(//input)[5]"));
				Search.sendKeys("Shoes");
				Thread.sleep(2000);
		/*	List<WebElement> auto_sug = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count= 		auto_sug.size();
		{
			System.out.println(count);
		}
		auto_sug.get(4).click();*/
			WebElement Search_Click= driver.findElement(By.xpath("(//input)[6]"));
	Search_Click.sendKeys(Keys.ENTER);
	Set<String> s1= driver.getWindowHandles();
	System.out.println(s1);
	Iterator<String>pcid=s1.iterator();
	String parentid = pcid.next();
	String childid = pcid.next();
	System.out.println(parentid);
	System.out.println(childid);
	}

}
