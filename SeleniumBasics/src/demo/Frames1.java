package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
        driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("Deprecated")).click();
		

			
	}
	
	}

