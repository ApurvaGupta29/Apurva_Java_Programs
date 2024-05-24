package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/apgupta/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
	Thread.sleep(2000);
		WebElement Uname= driver.findElement(By.xpath("(/html/body/input)[1]"));
	Uname.sendKeys("Apgupta");
	WebElement Hint= driver.findElement(By.xpath("(/html/body/input)[2]"));
	Hint.sendKeys("App");
	
	WebElement Password= driver.findElement(By.xpath("(/html/body/input)[3]"));
	Password.sendKeys("*********");
	
	WebElement F_name= driver.findElement(By.xpath("(html/body/form/input)[1]"));
	F_name.sendKeys("Apurva");
	
	//WebElement L_name= driver.findElement(By.xpath("(html/body/form/input)[2]"));
	//L_name.sendKeys("Gupta");
	
//	WebElement Submit= driver.findElement(By.xpath("(html/body/form/input)[3]"));
//	Submit.click();
	
	WebElement Radio_buttn1= driver.findElement(By.xpath("((html/body/form)[2]/input)[1]"));
	Radio_buttn1.click();	
	
	WebElement Radio_buttn2= driver.findElement(By.xpath("((html/body/form)[2]/input)[2]"));
	Radio_buttn2.click();
	
	WebElement Radio_buttn3= driver.findElement(By.xpath("((html/body/form)[2]/input)[3]"));
	Radio_buttn3.click();
	
//	WebElement Submit2= driver.findElement(By.xpath("((html/body/form)[2]/input)[4]"));
 //   Submit2.click();
    
    WebElement Who_YOU_Are= driver.findElement(By.xpath("(html/body/input)[4]"));
    Who_YOU_Are.click();
    
    WebElement Who_YOU_Are1= driver.findElement(By.xpath("(html/body/input)[5]"));
    Who_YOU_Are1.click();
    
    WebElement CheckBOX= driver.findElement(By.xpath("(html/body/input)[6]"));
    CheckBOX.click();
    
    WebElement SignUP= driver.findElement(By.xpath("(html/body/input)[7]"));
    SignUP.click();
	}

}
