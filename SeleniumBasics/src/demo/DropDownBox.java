package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=eea1da59a6552623fa3f35001a4699f7");
		
		WebElement x = driver.findElement(By.name("country")); //the entire driver.findElement can be 
		//stored in 'x'. Dropdown box for selenium is a web element.
		
		Select country = new Select(x); //select is a pre-defined class which has the 
		//functionality written in it to select some value. we can select a value from
		//drop down box. created an object of that class so that we can use the methods
		//written inside the select class. we need to create the object (select) of a class 
		
		country.selectByVisibleText("UNITED ARAB EMIRATES");
		//country.selectByIndex(12); - country can also be selected by index. 
		//the first country will start with 0.
		//country.selectByValue("234"); - country can also be selected by value.
		//value for each country can be visible through firebug 
	}
}
