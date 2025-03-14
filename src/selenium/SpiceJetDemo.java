package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpiceJetDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// spice jet
		invokeBrowser("firefox");
		driver.get("https://book.spicejet.com/");
		//Do the from and to city selection 
		//From city
		driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@text='Goa (GOX)']")).click();
		//click to city
		driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();
		//click calendar
		//driver.findElement(By.id("custom_date_picker_id_1")).click();

		//Day count
		int count = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		System.out.println(count);//60
		
		
		/*
		 * 
		 * String month="June";
		String date="//a[@data-date='2']";
		int flag=1;
		while(flag==1)
		{
			String name=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println(name);
			if(name.equals(month))
			{
				driver.findElement(By.xpath(date)).click();
				break;
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		}
		 */
		//month selection - logic
		String month="August";
		while(!driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains(month))
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}		
		
		//Day selection
		String day="15";
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
			if(text.equals(day)) //if (true)
			{
				//perform click
				System.out.println("We are inside the if condition");
				Thread.sleep(1000);
				driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
				break;
			}
		}
	}

}
