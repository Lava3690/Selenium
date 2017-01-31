package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amtrak.com/home");
		driver.findElement(By.xpath("//*[@id='subscribe_home']/div[1]/a")).click();
		
		Thread.sleep(5000); //execution can be paused for further execution. Also write 
		//interrupted exception along with thread.sleep(milliseconds)
		
		driver.switchTo().alert().accept();// for positive actions like OK, Yes etc
	
		//driver.switchTo().alert().dismiss(); - for negative actions like 
		//dismiss, no or cancel etc
	
		
	}

}
