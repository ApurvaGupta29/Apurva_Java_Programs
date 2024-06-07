package Selenium24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Pharmacy {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.1mg.com/");
	//	driver.get("https://www.walgreens.com/");
		driver.manage().window().maximize();
		
		WebElement Search11= driver.findElement(By.className("style__close-icon___3FflV"));
		Search11.click();
		Thread.sleep(2000);
		WebElement Search2= driver.findElement(By.className("UpdateCityModal__update-confirm___1iV9N"));
	Search2.click();
//	WebElement Search1=	driver.findElement(By.xpath("//input[@name='Ntt']"));
//	Search1.sendKeys("Sunscreen");
		WebElement Search= driver.findElement(By.id("srchBarShwInfo"));
			Search.sendKeys("Cetaphil");
				
			List<WebElement> auto_sug =driver.findElements(By.xpath("//li[@class='styles__search-item___CYeTh']/a/div"));
			//	List<WebElement> auto_sug =driver.findElements(By.xpath("//div[@id='v']/ul/li"));
				Thread.sleep(2000);
			int count=	auto_sug.size();
		
			{
				System.out.println(count);
			}
			Thread.sleep(2000);
			auto_sug.get(3).click();
				
	}

}
