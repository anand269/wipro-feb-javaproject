package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("firefox");
		/*
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * 
		 * //Scroll down by 200 or 300 pixels JavascriptExecutor js =
		 * (JavascriptExecutor)driver; js.executeScript("window.scrollBy(0,300)");
		 * 
		 * //Click the alert btn driver.findElement(By.id("alertbtn")).click();
		 * Thread.sleep(2000);
		 * 
		 * //popup window -> handling driver.switchTo().alert().accept();//click on ok
		 * btn driver.switchTo().alert().dismiss();//click on cancel btn
		 */		
		
		  driver.navigate().to("https://demoqa.com/alerts");
		  driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
			/*
			 * driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click
			 * (); Thread.sleep(2000); driver.switchTo().alert().accept();
			 */
		 //Explicit wait -> conditional wait
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.alertIsPresent());
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 
	}

}
