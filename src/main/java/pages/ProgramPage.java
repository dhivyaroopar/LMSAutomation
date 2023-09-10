package pages;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage {
	String headername;
	
	
	public WebDriver driver;
	@FindBy(xpath="//a[text()='program']") WebElement program;
	@FindBy(xpath="<label for=\"showing entries\">Showing x to y of z entries?</label>") WebElement showingnoofentries ;
	@FindBy(xpath="<label for=\"total entries\">Showing z entries?</label>")WebElement totalentries;
	@FindBy (xpath="//input[@value='Delete']")WebElement topleftdelete;
	@FindBy (xpath="//input[@value='AddNewProgram']")WebElement Addnewprogram;
	@FindBy(xpath="//table[@id='users_table']/tbody")WebElement Webtablerows;
	@FindBy(xpath="<h1 id = “h1>programname</h1>")WebElement programnameheader;
	@FindBy(xpath="<h2 id = “h2>programdescription</h2>")WebElement programdescriptionheader ;
	@FindBy(xpath="<h3 id = “h3>programstatus</h3>")WebElement programstatusheader ;
	@FindBy(xpath="<h4 id = “h4>editdelete</h4>")WebElement editdeleteheader;
	@FindBy(id="sortarrow1")WebElement programnamesortarrow;
	@FindBy(id="sortarrow2")WebElement programdescriptionsortarrow;
	@FindBy(id="sortarrow3")WebElement programstatussortarrow;
	@FindBy (name="search") WebElement search;

	public ProgramPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 public void clickprogram() {
	program.click();
}
public void webtablerows() {
	List<WebElement>TotalRowsList =Webtablerows.findElements(By.tagName("tr"));
	System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
}
public void headercolumn (String data) {
	
	switch(data) {
	case 1:
	}
	
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
    	driver.findElement(By.xpath(beforepath+i+ "]/td[i]")).isDisplayed();	
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


}
