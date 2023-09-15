package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.LoggerLoad;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class StudentPage {

	@FindBy(xpath="//a[contains(text(),'Student Details Page']")WebElement studentPageTxt;
	@FindBy(xpath="//a[text()='400 brokenlink']") WebElement badRequest;
	@FindBy(xpath="//h1[@class='lms-title']")WebElement lmsTitleLocator;
	@FindBy(xpath="//*[contains(text(),'Program Name')]")WebElement programNameLabel;
	@FindBy(xpath="//*[contains(text(),'Student Name')]")WebElement studentNameLabel;
	@FindBy(xpath="//*[contains(text(),'Student')]")WebElement attendanceLabel;
	@FindBy(xpath="//*[contains(text(),'Attendance Date')]")WebElement attendanceDateLabel;
	@FindBy(xpath="//*[contains(text(),'Class Name')]")WebElement classNameLabel;
	@FindBy(css = ".navigationbar.top-right")private WebElement navigationBar;
	@FindBy(id = "Admin")private WebElement admin;
	@FindBy(id = "Student")private WebElement student;
	@FindBy(id = "Program")private WebElement program;
	@FindBy(id = "Batch")private WebElement batch;
	@FindBy(id = "Class")private WebElement classele;
	@FindBy(id = "User")private WebElement user;
	@FindBy(id = "Assignment")private WebElement assignment;
	@FindBy(id = "Attendance")private WebElement attendance;
	@FindBy(id = "Logout")private WebElement logout;
	@FindBy(xpath = "//h1[contains(text(),'Manage Program')]")
	private WebElement manageProgramHeader;
	@FindBy(id = "dropdown_student_name")private WebElement dropDown1;
	@FindBy(id = "dropdown_batch_id")private WebElement dropDown2;
	@FindBy(xpath = "//*[contains(text(),'Search')]")private WebElement searchBox;
public WebDriver driver;
	
	public StudentPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clicklinkondashboard(String module) {
		
		 switch(module) {
		
		 case "Program" :  program.click();break;
		 case "Student"	: student.click();break;
		 case "Batch"	: batch.click();break;
		 case "Class"	: classele.click();break;
		 case "User"	: user.click();break;
		 case "Assignment":assignment.click();break;
		 case "Attendance": attendance.click();break;
		 case "Logout" : logout.click();
		 }
		
	}
	public boolean navigationTime() {
	    long start = System.currentTimeMillis();
	    student.click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOf(studentPageTxt));
	    long timeToLoad= (System.currentTimeMillis()-start);
	    if (timeToLoad<30) 
	    	return true;      
	    else 
	    	return false;
	}
	
	public boolean verifyBrokenLink() throws IOException {
		WebElement element=driver.findElement(By.linkText("a"));
		
		String url=element.getAttribute("href");
		URL link=new URL(url);
		HttpURLConnection httpConn=(HttpURLConnection) link.openConnection();
		httpConn.connect();
		int rescode=httpConn.getResponseCode();
		if(rescode>400) {
			System.out.println(url+" is a broken link");
			return true;
		}
		else return false;
}
	public boolean AreFieldInCenter() {
		 // Get the size and location of the first field
       Point field1Location = studentPageTxt.getLocation();
       int field1X = field1Location.getX() + studentPageTxt.getSize().getWidth() / 2;
       int field1Y = field1Location.getY() + studentPageTxt.getSize().getHeight() / 2;


       // Calculate the center coordinates of the page
       int centerX = driver.manage().window().getSize().getWidth() / 2;
       int centerY = driver.manage().window().getSize().getHeight() / 2;

       // Validate if both fields are positioned at the center
       boolean isField1Centered = field1X == centerX && field1Y == centerY;
      

       if (isField1Centered) {
       	System.out.println("Student detailspage positioned at the center of the page.");
       } else {
           System.out.println("Not in center");
       }
		return isField1Centered;

		}


public boolean ArePresentDropdowns()
{
	return dropDown1.isDisplayed() && dropDown2.isDisplayed();
		
}
public boolean AreSearchBoxForDisplay() {
  
	dropDown1.click();
	dropDown2.click();

   return searchBox.isDisplayed();
}
public boolean isStudentDetailsDisplayed() {
    return !student.isDisplayed() ;
}
public boolean isStudentNameCorrect(String expectedName) {
    String actualName = searchBox.getText();
    return actualName.equals(expectedName);
}  
public String getTextColor1() {
	return dropDown1.getCssValue("color");
}
public String getTextColor2() {
	return dropDown1.getCssValue("color");
} 
public String getTextDropDown1() {
	return dropDown1.getText();
} 
public String getTextDropDown2() {
	return dropDown2.getText();
} 


}
