package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WikipediaDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		//capture english link
		WebElement engLink = driver.findElement(By.id("js-link-box-en"));
		engLink.click();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign")).click();
	}

}
