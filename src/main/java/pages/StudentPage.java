package pages;

import java.util.NoSuchElementException;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.graphbuilder.curve.Point;

import io.cucumber.messages.types.Duration;
import pages.StudentPage;
import utilities.TestBase;
import utilities.TestContextSetup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentPage {

private static WebDriver driver;
//String URL = TestContextSetup.getApplicationUrl();

// constructor
public StudentPage(WebDriver driver) {
StudentPage.driver = driver;
PageFactory.initElements(driver, this); // initializing WebElelements
}

// Program Link -Assumption
@FindBy(name = "Program") WebElement programLink;

// Batch Link -Assumption
@FindBy(name = "Batch")
WebElement batchLink;

// Class Link -Assumption
@FindBy(name = "Class")
WebElement classLink;

// User Link -Assumption
@FindBy(name = "User")
WebElement userLink;

// Assignment Link -Assumption
@FindBy(name = "Assignment")
WebElement assignmetLink;

// Attendance Link -Assumption
@FindBy(name = "Attendance")
WebElement attendanceLink;

// Logout Link -Assumption
@FindBy(name = "Logout")
WebElement logoutBtn;

@FindBy(className = "Student-Page-title")
WebElement studentPageTitle; // Assuming LMS title has a class "lms-title"

@FindBy(className = "menu-item")
List menuItems; // Assuming LMS title has a class "navbar-text-container"

@FindBy(className = "lms-title")
WebElement lmsTitle; // Assuming LMS title has a class "lms-title"

// Page Title-Assumption
@FindBy(tagName = "title")
WebElement getPageTitle;

// Student Detail Title
@FindBy(id = "studentDetail")
WebElement studentDetailTitle;

// Student Dropdown
@FindBy(id = "studentDropdown")
WebElement selectStudentDropdown;

// Batch Id Dropdown
@FindBy(id = "batchIdDropdown")
WebElement selectbatchIdDropdown;

// Student Search Box
@FindBy(id = "studentSeachBox")
WebElement studentSeachBox;

// BatchID Search Box
@FindBy(id = "batchIdSeachBox")
WebElement batchIdSearchBox;

// Student Record
@FindBy(className = "studentResult")
WebElement studentResult;

@FindBy(className = "select-item")
List selectItems; // Assuming LMS title has a class "navbar-text-container"

public void clickProgramLink() {
programLink.click();

}

public void clickBatchLink() {
batchLink.click();
}

public void clickClassLink() {
classLink.click();

}

public void clickUserLink() {
userLink.clear();

}

public void clickAssignmentLink() {
assignmetLink.click();
}

public void clickAttendanceLink() {
attendanceLink.click();
}

public void clickLogoutLink() {
logoutBtn.click();
}

public static String getCurrentPageTitle() {
return driver.getTitle().trim();
}

public String getlmsTitleText() {
return lmsTitle.getText();
}

public boolean iscenterAligned1() {
	String textAlignment = StudentPage.getCssValue("text-center");
	if (textAlignment.equals("center")) 
	return true;
	else
	return false;

}

private static String getCssValue(String string) {
	// TODO Auto-generated method stub
	return null;
}

public String getPageTitle() {
return getPageTitle.getText();
}

public Point locateStudentDetailTitle() {
return (Point) studentDetailTitle.getLocation();
}

public boolean isDropDownSpellingCorrect(String dropdownName) {
boolean isCorrectName = selectStudentDropdown.getText().equals(dropdownName);
return isCorrectName;

}

public boolean isDropdownVisible(String dropdownName) {
if (dropdownName.equalsIgnoreCase("Student Name"))
return selectStudentDropdown != null;
else if (dropdownName.equalsIgnoreCase("Batch Id"))
return selectbatchIdDropdown != null;
else
return false;
}

public boolean isSearchBoxVisible(String dropdownName) {
if (dropdownName.equalsIgnoreCase("Student Name")) {
selectStudentDropdown.click();
return studentSeachBox != null;
} else if (dropdownName.equalsIgnoreCase("Batch Id")) {
selectbatchIdDropdown.click();
return batchIdSearchBox != null;
} else
return false;
}

public String firstDropDownTitle(String expectedLabel) {
return selectItems.setId(0).getText();
}

public String secondDropDownTitle(String expectedLabel) {
return selectItems.setId(1).getText();
}

public void scrollStudentDropdown() {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", selectStudentDropdown);
}

public void scrollBatchDropdown() {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", selectbatchIdDropdown);
}

public String selectNameFromStudentDropdown() {
Select studentNameDropdown = new Select(selectStudentDropdown);

// Selecting a student name, e.g., "Steve" (replace with the desired name or
// parameterize this)
studentNameDropdown.selectByVisibleText("Steve");
if (studentNameDropdown.getFirstSelectedOption() == null)
return ("failed");
else
return ("Steve");
}

public String selectBatchIdFromBatchDropdown() {
Select batchIdDropdown = new Select(selectbatchIdDropdown);

batchIdDropdown.selectByVisibleText("8428");
if (batchIdDropdown.getFirstSelectedOption() == null)
return ("failed");
else
return ("8428");
}

public void clickStudentDropDown() {
selectStudentDropdown.click();
}

public void clickBatchIdDropDown() {
selectbatchIdDropdown.click();
}

public void findStudentNameByAlphabet(String dropdownName, String inputAlphabet) {
if (dropdownName.equalsIgnoreCase("Student Name")) {
selectStudentDropdown.click();
studentSeachBox.sendKeys(inputAlphabet);
} else if (dropdownName.equalsIgnoreCase("Batch Id")) {
selectbatchIdDropdown.click();
batchIdSearchBox.sendKeys(inputAlphabet);
}
}

public String selectStudentNameByAlphabet(String dropdownName) {
if (dropdownName.equalsIgnoreCase("Student Name")) {
Select studentNameDropdownValues = new Select(selectStudentDropdown);
return studentNameDropdownValues.getFirstSelectedOption().getText();
} else if (dropdownName.equalsIgnoreCase("Batch Id")) {
Select batchIdDropdownValues = new Select(selectbatchIdDropdown);
return batchIdDropdownValues.getFirstSelectedOption().getText();
} else
return null;
}

public boolean isStudentResultDisplayed() {
return studentResult.isDisplayed();
}

}