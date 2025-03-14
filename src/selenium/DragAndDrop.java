package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("edge");
		driver.get("https://demoqa.com/droppable/");
		//identify drag and drop objects
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		//Perform Drag and Drop using Actions class
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		//capture the text
		String txtMsg = target.getText();
		System.out.println(txtMsg);
		//validation
		if(txtMsg.equals("Dropped!"))
		{
			System.out.println(txtMsg+" successfully");
		}
		else
			System.out.println(txtMsg+" failed");
		
		closeBrowser();
	}

}
