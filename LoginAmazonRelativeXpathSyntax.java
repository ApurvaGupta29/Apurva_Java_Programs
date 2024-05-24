package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAmazonRelativeXpathSyntax {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fcomputers-and-accessories%2Fb%2F%3Fie%3DUTF8%26node%3D976392031%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement signin = driver.findElement(By.xpath("//input[@id='ap_email']"));
		signin.sendKeys("9891718014");
		WebElement Conti = driver.findElement(By.xpath("//input[@id='continue']"));
		Conti.click();
		WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		Password.sendKeys("***********");
		WebElement remember = driver.findElement(By.xpath("//input[@name='rememberMe']"));
		remember.click();
		WebElement Submit = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		Submit.click();
	}

}
