package utilities;

import java.util.Iterator;

import java.util.Set;


import org.openqa.selenium.WebDriver;



//reusable methods
public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	//explicit wait, parse string all common methods
	public void SwitchWindowToChild() {
		// Parent -child window handler
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}
	public void navigateBack() {
		 
		  driver.navigate().back();
		   	  	  
		  }
	
	public void navigateForward() {
		 
		  driver.navigate().forward();
		 		  	  
		  }

	}
