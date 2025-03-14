package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandleDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("firefox");
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		//Click on Help, T&C etc
		driver.findElement(By.linkText("Help")).click();
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String parent = it.next();//parent window
		String help = it.next();//Help window - child
		//switch to child window
		driver.switchTo().window(help);
		Thread.sleep(8000);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Help")));
		 */
		
		System.out.println(driver.getTitle());//prints the current page title
		driver.switchTo().window(parent);//parent window
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//close() will close the current active window and quit() will close all the windows opened by selenium 
		driver.quit(); 
	}

}
