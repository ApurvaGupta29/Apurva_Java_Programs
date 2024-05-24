package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegisterFB {

	public static void main(String[] args) {
		//ChromeDriver driver = new  ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement Register=driver.findElement(By.linkText("Create new account"));
Register.click();
WebElement F_name = driver.findElement(By.name("firstname"));
F_name.sendKeys("Apurva");

WebElement S_name = driver.findElement(By.name("lastname"));
S_name.sendKeys("Gupta");

WebElement Email_name = driver.findElement(By.name("reg_email__"));
Email_name.sendKeys("apurva9110@gmail.com");

WebElement Email1_name = driver.findElement(By.name("reg_email_confirmation__"));
Email1_name.sendKeys("apurva9110@gmail.com");

WebElement pass_name = driver.findElement(By.id("password_step_input"));
pass_name.sendKeys("*******");

WebElement SignUp=driver.findElement(By.linkText("Sign Up"));
SignUp.click();


	}

}
