package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering { //action class - mouse hovering over certain links on webpage to 
	//check if they function properly
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("xxx")); - use this to find the xpath of the close button of 
		//subscribe pop-up window to close it. 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.barnesandnoble.com/");
		
		WebElement Kids = driver.findElement(By.linkText("Kids"));
		Actions action = new Actions(driver);
		action.moveToElement(Kids).build().perform(); //build is going to consolidate 
		//the actions given above. perform() is going to execute those actions.
		
		driver.findElement(By.linkText("Bestsellers")).click();
	}

}
