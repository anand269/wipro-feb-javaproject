package selenium;

import org.openqa.selenium.By;

public class DatePickerDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		Thread.sleep(5000);
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]")).click();
	}

}
