package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFB {

	public static void main(String[] args) {
		ChromeDriver driver = new  ChromeDriver();
	//	EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/reg/");
driver.manage().window().maximize();
//WebElement Register=driver.findElement(By.linkText("Create new account"));
//Register.click();
WebElement F_name = driver.findElement(By.name("firstname"));
F_name.sendKeys("Apurva");

WebElement S_name = driver.findElement(By.name("lastname"));
S_name.sendKeys("Gupta");

WebElement Email_name = driver.findElement(By.name("reg_email__"));
Email_name.sendKeys("apurva9110@gmail.com");

//WebElement Email1_name = driver.findElement(By.name("reg_email_confirmation__"));
//Email1_name.sendKeys("apurva9110@gmail.com");

WebElement pass_name = driver.findElement(By.id("password_step_input"));
pass_name.sendKeys("*******");

WebElement day = driver.findElement(By.id("day"));

Select s1 = new Select(day);
s1.selectByIndex(1);

WebElement month = driver.findElement(By.id("month"));
Select s2 = new Select(month);
s2.selectByIndex(9);
WebElement year = driver.findElement(By.id("year"));
Select s3 = new Select(year);
s3.selectByVisibleText("1991");

//WebElement SignUp=driver.findElement(By.linkText("Sign Up"));
//SignUp.click();


	}

}
