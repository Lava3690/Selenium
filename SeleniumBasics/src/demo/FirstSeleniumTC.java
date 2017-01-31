package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTC {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.findElement(By.id("u_0_l")).click();
}
}
