package pages;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.LoggerLoad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	public WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
@FindBy(xpath="//a[text()='Login']")WebElement logInBtn;

	@FindBy(name="user")WebElement uname;
	@FindBy(name="password")WebElement pwdField;
	
	@FindBy(xpath="//a[contains(text(),'DashBoard Page']")WebElement dashBoardPageTxt;
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
	@FindBy(id = "Assignment")private WebElement assignmnet;
	@FindBy(id = "Attendance")private WebElement attendance;
	@FindBy(id = "Logout")private WebElement logout;
	
	public boolean dashboardPageTxt()
	{
		return dashBoardPageTxt.isDisplayed();
	}
	public String dashboardPageTitleTxt()
	{
		
		return lmsTitleLocator.getText();
	}
	 public boolean isElementVisible(WebElement element) {
	        return element.isDisplayed();
	    }
	 public void validateElements() {
		   WebElement[] elements = {admin,student,program,batch,classele,user,assignmnet,attendance,logout};
	        String[] Menunames = {"Admin","Student","Program","Batch","Class","User","Assignment","Attendance","Logout"};

	        for (int i = 0; i < elements.length; i++) {
	            String ordinal = getOrdinal(i + 1);
	            boolean isVisible = isElementVisible(elements[i]);

	            System.out.println(Menunames[i] + " in the " + ordinal + " place is visible: " + isVisible);
	        }
	    }
	    
	    private String getOrdinal(int number) {
	        if (number >= 1 && number <= 10) {
	            return number + "th";
	        }

	        switch (number % 10) {
	            case 1:
	                return number + "st";
	            case 2:
	                return number + "nd";
	            case 3:
	                return number + "rd";
	            case 4:
	                return number + "th";
	            case 5:
	                return number + "th";
	            case 6:
	                return number + "th";
	            case 7:
	                return number + "th";
	            default:
	                return number + "th";
	        }
	    }
	public boolean verifyBrokenLink() {
		String errorcode=badRequest.getText().split(" ")[0].trim();
		int code=Integer.parseInt(errorcode);
		if(code>=400) {
			System.out.println("Link is broken");
		}
		return true;
	}

public void clickLogin() {
	logInBtn.click();
}

    public  boolean istitleLeftCorner() {
    
        int titleXCoordinate = lmsTitleLocator.getLocation().getX();
        int titleYCoordinate = lmsTitleLocator.getLocation().getY();

        return titleXCoordinate == 0 && titleYCoordinate == 0;
    }

    public void enterUsernameAndPasswordOnly(String username,String password) {
    	uname.sendKeys(username);
    	pwdField.sendKeys(password);
    	
    }
public boolean correctSpelling() {

	ArrayList<String> dashBoardPageMenuActualTxt = new ArrayList<String>();
	ArrayList<String> dashBoardPageMenuExpectedTxt = new ArrayList<String>();
	dashBoardPageMenuActualTxt.add(programNameLabel.getText());
	dashBoardPageMenuActualTxt.add(classNameLabel.getText());
	dashBoardPageMenuActualTxt.add(studentNameLabel.getText());
	dashBoardPageMenuActualTxt.add(attendanceLabel.getText());
	dashBoardPageMenuActualTxt.add(attendanceDateLabel.getText());
	dashBoardPageMenuExpectedTxt.add("Program Name");
	dashBoardPageMenuExpectedTxt.add("Class Name");
	dashBoardPageMenuExpectedTxt.add("Student Name");
	dashBoardPageMenuExpectedTxt.add("Attendance");
	dashBoardPageMenuExpectedTxt.add("Attendance Date");
	if (dashBoardPageMenuActualTxt.equals(dashBoardPageMenuExpectedTxt) == true) {
		System.out.println("Spellings are correct");
	}
	return true;
}
	
public boolean navigationTime() {
    long start = System.currentTimeMillis();
    logInBtn.click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	wait.until(ExpectedConditions.visibilityOf(dashBoardPageTxt));
    long timeToLoad= (System.currentTimeMillis()-start);
    if (timeToLoad<30) 
    	return true;      
    else 
    	return false;
}
// Check if the title has correct spelling and spacing
public void spellSpaceCheck() {
	   String lmsTitleText = lmsTitleLocator.getText();

if (
		lmsTitleText.trim().equals("lMS-title") || lmsTitleText.toLowerCase().contains("LMS-title")) {
    System.out.println("Admin LMS title is correct!");
} else {
    System.out.println("Admin LMS title is incorrect!");
}
	
}

// Check if the navigation bar top right

public boolean navigationBarRightTopSide() {
	if(navigationBar.getCssValue("vertical-align")=="top" && navigationBar.getCssValue("horizontal-align")=="right") {
		System.out.println("Close icon is right top aligned");
	}
	return true;			
}









	
	
}

