package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JASM_usingrelativeXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/apgupta/Desktop/Apurva%20github%20local/learningHTML1.html");
WebElement username=driver.findElement(By.xpath("//input[@id='1']"));
username.sendKeys("Apgupta");

WebElement Hint=driver.findElement(By.xpath("//input[@id='2']"));
Hint.sendKeys("Ap");

WebElement password=driver.findElement(By.xpath("//input[@id='3']"));
password.sendKeys("Ap");

WebElement F_name=driver.findElement(By.xpath("//input[@name='fname']"));
F_name.sendKeys("Apurva");

WebElement L_name=driver.findElement(By.xpath("//input[@name='lname']"));
if(L_name.isDisplayed() && L_name.isEnabled())
{
L_name.sendKeys("Apurva");

}
else
{
	System.out.println("Element is disabled");
}

WebElement Check_Box1=driver.findElement(By.xpath("//input[@id='123']"));
Check_Box1.click();

WebElement Check_Box2=driver.findElement(By.xpath("//input[@value='Girl']"));
Check_Box2.click();

WebElement Check_Box3=driver.findElement(By.xpath("//input[@id='321']"));
Check_Box3.click();

WebElement male_radio=driver.findElement(By.xpath("//input[@type='radio'][1]"));
male_radio.click();

WebElement Female_radio=driver.findElement(By.xpath("//input[@type='radio'][2]"));
Female_radio.click();

WebElement right_Click=driver.findElement(By.linkText("Click to know about us"));
Actions a1 =new Actions(driver);
 a1.contextClick(right_Click).perform();

WebElement drop_down=driver.findElement(By.id("Relegion"));

Select s1 = new Select(drop_down);
s1.selectByValue("2");

WebElement SignUP=driver.findElement(By.xpath("//input[@type='button']"));
SignUP.click();

	}

}
