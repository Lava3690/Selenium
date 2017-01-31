package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames2 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("Deprecated")).click();
		
		driver.switchTo().defaultContent();
		
	}

}
