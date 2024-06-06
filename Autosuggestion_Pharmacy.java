package Selenium24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Pharmacy {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	//	driver.get("https://www.1mg.com/?wpsrc=Yahoo+Organic+Search");
		driver.get("https://www.walgreens.com/");
		driver.manage().window().maximize();
		WebElement Search1=	driver.findElement(By.xpath("//input[@name='Ntt']"));
		Search1.sendKeys("Sunscreen");
		//WebElement Search1= driver.findElement(By.className("style__close-icon___3FflV"));
		//Search1.click();
		//Thread.sleep(2000);
		//WebElement Search2= driver.findElement(By.className("UpdateCityModal__update-confirm___1iV9N"));
	//Search2.click();
		
	//	WebElement Search= driver.findElement(By.id("srchBarShwInfo"));
		//		Search.sendKeys("Cetaphil");
				
		//	List<WebElement> auto_sug =driver.findElements(By.xpath("//div[@class='col-xs-12 col-sm-9 col-md-9 searchbar-container styles__search-bar___e1Afp']/div/div"));
				List<WebElement> auto_sug =driver.findElements(By.xpath("//div[@class='nav__top-container']/div/div"));
			int count=	auto_sug.size();
			{
				System.out.println(count);
			}
			auto_sug.get(3).click();
				
	}

}
