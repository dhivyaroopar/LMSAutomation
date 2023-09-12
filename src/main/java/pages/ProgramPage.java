package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestContextSetup;

public class ProgramPage {
	
	public WebDriver driver;
	//managevalidation
	@FindBy(xpath="//a[text()='program']") WebElement program;
	@FindBy(xpath="//a[text()='student']") WebElement student;
	@FindBy(xpath="//a[text()='batch']") WebElement batch;
	@FindBy(xpath="//a[text()='user']") WebElement user;
	@FindBy(xpath="//a[text()='class']") WebElement classname;
	@FindBy(xpath="//a[text()='Assignment']") WebElement assignment;
	@FindBy(xpath="//a[text()='Attendance']") WebElement attendance;
    @FindBy(xpath="<label for=\\\"heading\\\">Showing heading?</label>") WebElement heading;
	@FindBy(xpath="<label for=\"showing entries\">Showing x to y of z entries?</label>") WebElement showingnoofentries ;
	@FindBy(xpath="<label for=\"total entries\">Showing z entries?</label>")WebElement totalentries;
	@FindBy (xpath="//input[@value='Delete']")WebElement topleftdelete;
	@FindBy (xpath="//input[@value='AddNewProgram']")WebElement Addnewprogram;
	@FindBy(xpath="//table[@id='users_table']/tbody")WebElement Webtablerows;
	@FindBy(xpath="<h1 id = “h1>programname</h1>")WebElement programnameheader;
	@FindBy(xpath="<h2 id = “h2>programdescription</h2>")WebElement programdescriptionheader ;
	@FindBy(xpath="<h3 id = “h3>programstatus</h3>")WebElement programstatusheader ;
	@FindBy(xpath="<h4 id = “h4>edit</h4>")WebElement editheader;
	@FindBy(xpath="<h4 id = “h4>delete</h4>")WebElement deleteheader;
    @FindBy(id="sortarrow1")WebElement programnamesortarrow;
	@FindBy(id="sortarrow2")WebElement programdescriptionsortarrow;
	@FindBy(id="sortarrow3")WebElement programstatussortarrow;
	@FindBy (name="search") WebElement search;
	
	//add program
	@FindBy(name = "name") WebElement entername;
	@FindBy(name = "description") WebElement enterdescription;
	@FindBy(xpath = "//a[text()='save']") WebElement clicksave;
	@FindBy(xpath = "//a[text()='cancel']") WebElement clickcancel;
	@FindBy(xpath="//input[@value='active']") WebElement activeradiobtnstatus;
	@FindBy(xpath="//input[@value='inactive']") WebElement inactiveradiobtnstatus;
	@FindBy(xpath = "//a[text()='save']") WebElement clickclose;
	
	//edit program
	@FindBy(xpath="/parent::td//preceding-sibling::td(1)//input[@type=‘editbutton’]") WebElement editbtn1;
//delete program
	@FindBy(xpath="/parent::td//preceding-sibling::td(1)//input[@type=‘deletebutton’]") WebElement deletebtn1;

	public ProgramPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//managevalidation
	public void clicklinkondashboard(String module) {
		
		 switch(module) {
		
		 case "Program" :  program.click();break;
		 case "Student"	: student.click();break;
		 case "Batch"	: batch.click();break;
		 case "Class"	: classname.click();break;
		 case "User"	: user.click();break;
		 case "Assignment"	: assignment.click();break;
		 case "Attendance"	: attendance.click();break;
		
		 }
		
	}
	public String appearonheading() {
		String hdng=heading.getText();
		return hdng;
	}
	
	public String appearonpaginationicon() {
		String pagn= showingnoofentries.getText();
		return pagn;
	}
	public String totalentiespaginationicon() {
		String pagn= totalentries.getText();
		return pagn;
	}
 public boolean checkdisableddeleteicon() {
	boolean disableicon= topleftdelete.isEnabled();
	 return false;
 }
 public String appearingaddnewprog() {
	 String addnewpg=Addnewprogram.getText();
	 return addnewpg;
 }
	
public int webtablerows() {
	
	List<WebElement>TotalRowsList =Webtablerows.findElements(By.tagName("tr"));
	//System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
	int Rowcount=TotalRowsList.size();
	return Rowcount ;
}
public void headercolumn(String data) {
	switch(data) {
	case "Program Name": programnameheader.isDisplayed();break;
	case "Program Description": programdescriptionheader.isDisplayed();break;
	case "Program Status": programstatusheader.isDisplayed();break;
	case "Edit":editheader.isDisplayed();break;
	case "Delete": deleteheader.isDisplayed();}		
}
public void sortarrowbutton() {
	programnamesortarrow.isDisplayed();
	programdescriptionsortarrow.isDisplayed();
	programstatussortarrow.isDisplayed();
}
public void checkboxcheck() {
	int checkboxlist =Webtablerows.findElements(By.tagName("tr")).size();
    String beforepath="//*[@id=\"resultTable\"]/tbody/tr[";
    for(int i=1;i<checkboxlist;i++) {
    	driver.findElement(By.xpath("/parent::td//preceding-sibling::td//input[@type=‘checkbox’]")).isDisplayed();	
}
}
public void editcheck() {
	int checkboxlist =Webtablerows.findElements(By.tagName("tr")).size();
	String beforepath="//*[@id=\"resultTable\"]/tbody/tr[";
    for(int i=1;i<checkboxlist;i++) {
    	driver.findElement(By.xpath("/parent::td//preceding-sibling::td//input[@type=‘editbutton’]")).isDisplayed();
    }
}
public void deletecheck() {
	int checkboxlist =Webtablerows.findElements(By.tagName("tr")).size();
	String beforepath="//*[@id=\"resultTable\"]/tbody/tr[";
    for(int i=1;i<checkboxlist;i++) {
    	driver.findElement(By.xpath("/parent::td//preceding-sibling::td//input[@type=‘deletebutton’]")).isDisplayed();
    }
}
public String textsearch() {
	String searchboxtext=search.getText();
	return searchboxtext;
}

public void searchforprogname() {
	
	int rows =Webtablerows.findElements(By.tagName("tr")).size();
	
    for(int i=1;i<rows;i++) {
    	driver.findElement(By.xpath("/parent::td//preceding-sibling::td//input[@type=‘text’]")).isDisplayed();
    }
	
	}
public void searchforprogdescription() {
	
	int rows =Webtablerows.findElements(By.tagName("tr")).size();
	
    for(int i=1;i<rows;i++) {
    	driver.findElement(By.xpath("/parent::td//preceding-sibling::td//input[@type=‘text’]")).isDisplayed();
    }
	
	}
public void searchforprogstatus() {
	
	int rows =Webtablerows.findElements(By.tagName("tr")).size();
	
    for(int i=1;i<rows;i++) {
    	driver.findElement(By.xpath("/parent::td//preceding-sibling::td//input[@type=‘text’]")).isDisplayed();
    }
	}
public boolean searchwithzeroentries() {
	
	int rows =Webtablerows.findElements(By.tagName("tr")).size();
	if(rows==0)
	return true;
	else
		return false;
    }
public void enterinsearch(String data) {
	search.sendKeys(data);
}
public void displayenternameinsearch() {
	search.click();
}
//addprogram

public void clicknewprogram() {
	Addnewprogram.click();	
}
public boolean clickbtnscheckinaddprog() {
	
	if( clicksave.isDisplayed() && clickcancel.isDisplayed()&& clickclose.isDisplayed()) {
		return true;
	}
	else
		return false;
}
	
public boolean textboxcheckinaddprog() {
	
	if(entername.isDisplayed() && enterdescription.isDisplayed()) {
		return true;
	}
	else
		return false;
	}
public boolean popaddprogrmaradiobutton() {
	
	if(activeradiobtnstatus.isDisplayed() && inactiveradiobtnstatus.isDisplayed()) {
		return true;
	}
	else
		return false;
	}

public void clicksavebtn() {
	clicksave.click();
}
public void clickcancelbtn() {
	clickcancel.click();
}
public void clickclosebtn() {
	clickclose.click();
}
public String alertmsg() {
	return 
	driver.switchTo().alert().getText();
}
public void entertextprogramname(String name) {
	entername.sendKeys(name);
	
}
public void entertextprogramdescription(String description) {
	enterdescription.sendKeys(description);
	
}
	
public void clickradiobtnprogramstatusactive() {
	activeradiobtnstatus.click();
	
}
public void clickradiobtnprogramstatusinactive() {
	inactiveradiobtnstatus.click();
	
}
//edit program
public void clickeditprogram() {
	
	editbtn1.click();
}
public void cleartextfornameedit() {
	entername.clear();
}
public void cleartextfordescriptionedit() {
	enterdescription.clear();
}
//delete program
public void clickdeleteprogram() {
	
	deletebtn1.click();
}

	
}

