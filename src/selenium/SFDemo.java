package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		invokeBrowser("Firefox");//method is responsible to open the browser
		driver.get("https://login.salesforce.com/");//enter the url
		//Find the elements
		WebElement name = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.id("password"));
		name.sendKeys("admin");
		password.sendKeys("admin1243");
		//click login
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);//forced sleep for 2 secs
		//getting error msg -> Capture ?
		WebElement errorMsg = driver.findElement(By.id("error"));
		String error = errorMsg.getText();
		System.out.println(error);
		boolean s = errorMsg.isDisplayed();//whether it is displayed or not
		
		//Write the Validation part to make the test case pass/fail
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
