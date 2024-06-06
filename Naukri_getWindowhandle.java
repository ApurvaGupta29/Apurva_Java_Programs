package Selenium24;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_getWindowhandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
	Thread.sleep(2000);
		WebElement Uname= driver.findElement(By.xpath("//span[.='Google']"));
	Uname.click();
Set<String>	id=driver.getWindowHandles();
java.util.Iterator<String> id1= id.iterator();
String P_id= id1.next();
String C_id= id1.next();

driver.switchTo().window(C_id);

	}

}
