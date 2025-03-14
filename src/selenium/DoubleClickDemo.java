package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://demoqa.com/buttons");
		WebElement btnEl = driver.findElement(By.id("doubleClickBtn"));
		
		//Actions class
		Actions a = new Actions(driver);
		a.doubleClick(btnEl).perform();
		System.out.println("Double click performed");
		
		//Capture all the header details in the above table
	}

}
