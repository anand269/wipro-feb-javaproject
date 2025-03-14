package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException{
		// First program
		System.out.println("Hello welcome to Selenium");
		//To import ctr+shift+o from key board
	//	WebDriver driver = new ChromeDriver();//Open the chrome browser
		//WebDriver driver = new FirefoxDriver();//open the firefox browser
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");//Enter the URL
		String title = driver.getTitle();//To capture the title of the page
		System.out.println(driver.getTitle());
		//identify the object - use locators
		WebElement searchBox = driver.findElement(By.name("q"));
		driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("automation");//type the word
		searchBox.sendKeys(Keys.ENTER);//hit enter btn
		//searchBox.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);//to select India
		Thread.sleep(2000);
		
		driver.close();//close the browser
	}

}
