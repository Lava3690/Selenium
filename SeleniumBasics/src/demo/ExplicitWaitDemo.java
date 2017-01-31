package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\subbanaidu\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		
		String expectedText = "Hello World!";
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4"))); 
		
		String actualText = driver.findElement(By.xpath("//*[@id='finish']/h4")).getText();
		System.out.println(actualText);
		
		if(expectedText.equals(actualText)){
			System.out.println("Test Case Passed");
		}
	else{
			System.out.println("Test Case Failed");
		}
	}
	}
		
		
	
	

