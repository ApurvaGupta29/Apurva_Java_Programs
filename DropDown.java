package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
WebElement Drop = driver.findElement(By.id("searchDropdownBox"));

Select s1 = new Select(Drop);
//s1.selectByVisibleText("Electronics");
s1.selectByValue("search-alias=appliances");
//s1.selectByIndex(2);
/*Drop.sendKeys(Keys.ARROW_DOWN);
Drop.sendKeys(Keys.ARROW_DOWN);
Drop.sendKeys(Keys.ARROW_DOWN);
Drop.sendKeys(Keys.ARROW_DOWN);*/


	}

}
