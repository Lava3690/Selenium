package demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksWorking {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		//Step 1:List all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//1)use this to find all the links in webpage using tagname. important - all links start with anchor tag <a.
		//2) use List to store all the links on the web page. array list will store 
		//Web elements inside it. 
		System.out.println("Total number of links = " + links.size());
		
		//Step 2 & 3 - cut extra information and create an array
		String [] linkText = new String[links.size()];
		int i = 0;
		//links.size gives the total number of links on the page. eg - if there 
		//are 10 links the array would be of 10 elements. 
		
		for (WebElement e: links){ // e takes all values of links.
			linkText[i] = e.getText();//e.getText pertains to only retaining the word
			//Register, sign-on, support etc. 'i' is a variable. 
			//for eg: linkText[0] = Register. linkText[1] = sign-on etc 
			i++;// used for increment or iteration.
			
		}
		
		//Step 4 - 
		
		for (String t : linkText){//t can be made as a variable. we are setting 't' with varying texts like 
			//register, sign-on etc after cutting all of the extra info.
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals("Under Construction: Mercury Tours")){
				System.out.println(t + " is not working");
			}
			
			else{
				System.out.println(t + " is working");
	
			}
			
		}
		
		driver.navigate().back();
	
		 
	}
}
  