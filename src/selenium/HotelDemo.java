package selenium;

import org.openqa.selenium.By;

public class HotelDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// call browser 
		invokeBrowser("firefox");
		driver.get("https://adactinhotelapp.com/");
		
		//Use Xpath and CSS to identify the elements
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		//partial link text
		driver.findElement(By.partialLinkText(" Password?")).click();
	}

}
