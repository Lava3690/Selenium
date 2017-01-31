package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		String expectedTitle = "Facebook - Log in or Sign Up";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)){
			System.out.println("Test Case Passed");
		}
		else{
			System.out.println("Test Case Failed");
		}
		driver.close();
	}
}
