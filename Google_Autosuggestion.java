package Selenium24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement Search= driver.findElement(By.name("q"));
				Search.sendKeys("India");
				Thread.sleep(2000);
			List<WebElement> auto_sug = driver.findElements(By.className("pcTkSc"));
int count=			auto_sug.size();
{System.out.println(count);
}
auto_sug.get(5).click();
	}

}
