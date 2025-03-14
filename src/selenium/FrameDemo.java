package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("edge");
		driver.navigate().to("file:///D:/Automation/html/iframpage.html");
		
		//Find the elements
		WebElement txtBox1 = driver.findElement(By.id("t1"));
		txtBox1.sendKeys("Testing");
		
		//switching to frame (inside) 
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("t2")).sendKeys("Automation");
		driver.findElement(By.id("t3")).sendKeys("Selenium");
		
		//switch back to main window
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		txtBox1.clear();
		txtBox1.sendKeys("We are learning");
		
		closeBrowser();

	}

}
