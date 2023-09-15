package utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.LoginPage;




//reusable methods
public class GenericUtils {
	public WebDriver driver;
	ExcelReader reader;
	LoginPage loginPage;
	
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
	
	String xlPath=System.getProperty(("user.dir")+"//LMSAutomation//DataSet//TestData.xlsx");

	public void readingData(String sheetName,Integer rowNumber) throws InvalidFormatException, IOException 
	{
	List<Map<String,String>>testData =reader.getData(xlPath,sheetName);
	String uName = testData.get(rowNumber).get("UserName");
	String pwd = testData.get(rowNumber).get("PassWord");
	loginPage.enterCredentials(uName,pwd);
	}
	
	public void navigateBack() {
		 
		  driver.navigate().back();
		   	  	  
		  }
	
	public void navigateForward() {
		 
		  driver.navigate().forward();
		 		  	  
		  }
	public String getTitleOfThePage() 
	{
		return driver.getTitle();
	}
	
	
	public static boolean checkVisibility(WebElement element) 
	{
		boolean value;
		try 
		{
			value=element.isDisplayed();
			return value;
		}
		catch (Exception e)
		{
			return false;
		}		
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
/*
	public void waitForElementToappear(WebElement user) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(user));
	}
	public void ActionClass(WebElement e, String s) {
		Actions a = new Actions(driver);
		a.sendKeys(e, s).build().perform();
	}
	public String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		Utilities.ExcelReader reader = new Utilities.ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		code = testdata.get(rownumber).get("pythonCode");
		result = testdata.get(rownumber).get("Result");
		return code;
	}
	public void enterCode(String code, WebElement element) {
		new Actions(driver).sendKeys(element, code).perform();
	}
	public void enterCodePractice(String code, WebElement element) {
		new Actions(driver).keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}
	}
	
	public String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("/LMSAutomation/DataSet/TestData.xlsx", sheetname);
		result = testdata.get(rownumber).get("Result");
		return result;
	}*/
	
}
