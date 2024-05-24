package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement SIgn = driver.findElement(By.id("nav-link-accountList"));
SIgn.click();

WebElement SIgnUP = driver.findElement(By.linkText("Create your Amazon account"));
SIgnUP.click();

WebElement F_name = driver.findElement(By.id("ap_customer_name"));
F_name.sendKeys("Apurva");

WebElement Mobile_num = driver.findElement(By.id("ap_phone_number"));
Mobile_num.sendKeys("9891718014");

WebElement Password = driver.findElement(By.id("ap_password"));
Password.sendKeys("********");

WebElement Continue = driver.findElement(By.id("continue"));
Continue.click();
	}

}
