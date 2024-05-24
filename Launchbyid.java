package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbyid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
/*driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("apurva9110@gmail.com");
driver.findElement(By.id("pass")).sendKeys("********");
driver.findElement(By.name("login")).click();
*/
driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
driver.manage().window().maximize();
WebElement emailField = driver.findElement(By.id("ap_email"));
emailField.sendKeys("9891718014");

WebElement Conti_butt=driver.findElement(By.id("continue"));
Conti_butt.click();

WebElement Passwordfiled=driver.findElement(By.name("password"));
Passwordfiled.sendKeys("327979eyih");
WebElement Signin_Butt=driver.findElement(By.id("continue"));
Signin_Butt.click();
	}

}
