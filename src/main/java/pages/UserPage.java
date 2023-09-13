
	package pages;

import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestContextSetup;

    public abstract class UserPage<edit_icon> {
    	private static WebDriver driver1;
    	String URL = TestContextSetup.getApplicationUrl();

    	// constructor
    	public UserPage(WebDriver driver) {
    	UserPage.driver1 = driver;
    	PageFactory.initElements(driver, this); // initializing WebElelements
    	}
		
	private static final String LmsUrl = null;
	private static final Object True = null;
	private static final Object False = null;
	private static final int rowsCount = 0;

    String headername;
		
		
		public WebDriver driver;
		@FindBy(xpath="//a[text()='User']") WebElement ManageUser;
		@FindBy(xpath="<h1 id = 'Search'") WebElement SearchOption ;
	    @FindBy(xpath="<h1 id = '+  Add New User'")WebElement Addnewuser;
		@FindBy(xpath="<h2 id = '+ Assign Staff' ")WebElement Assignstaff ;
		@FindBy(xpath="<h3 id = Delete button")WebElement Deletebutton ;
		@FindBy(xpath="<h4 id = Checkbox1")WebElement Checkbox1;
		@FindBy(xpath="<h5 id = Checkbox2")WebElement Checkbox2 ;
		@FindBy(xpath="<h6 id = Name.Sort")WebElement NameSort;
		@FindBy(xpath="<h7 id = Location.Sort")WebElement LocationSort;
		@FindBy(xpath="<h8 id = PhoneNumber.Sort")WebElement PhoneNumberSort;
		@FindBy(xpath="<h9 id = Editbutton1")WebElement Editbutton1;
		@FindBy(xpath="<h10 id = Editbutton2")WebElement Editbutton2;
		@FindBy(xpath="<h11 id = Deletebutton1")WebElement Deletebutton1;
		@FindBy(xpath="<h12 id = Deletebutton2")WebElement Deletebutton2;
		@FindBy(xpath="<h13 id = Pagination")WebElement Pagination;
		@FindBy(xpath="<h14 id = Pop Up")WebElement Popup;
		@FindBy(xpath="<h15 id = First name")WebElement FirstName;
		@FindBy(xpath="<h16 id = Middle Name ")WebElement Middlename ;
		@FindBy(xpath="<h17 id = Last Name")WebElement LastName;
		@FindBy(xpath="<h18 id = Location")WebElement Location ;
		@FindBy(xpath="<h19 id = Phone ")WebElement Phone ;
		@FindBy(xpath="<h20 id = Email ")WebElement Email;
		@FindBy(xpath="<h21 id = Linkedin URL")WebElement LinkedIn;
		@FindBy(xpath="<h19 id = Post Graduate ")WebElement PostGraduate ;
		@FindBy(xpath="<h20 id = Time Zone ")WebElement Timezone;
		@FindBy(xpath="<h21 id = User Comment")WebElement Usercomment;
		@FindBy(xpath="<h22 id = Submit")WebElement Submit;
		@FindBy(xpath="<h23 id = Cancel")WebElement Cancel;
		@FindBy(xpath="<h24 id = Manager User Header")WebElement ManageUserHeader;
		@FindBy(xpath="<h25 id = Manager User Table")WebElement ManageUserTable;
		@FindBy(xpath="<h26 id = New User Added")WebElement NewUserAdded;
		@FindBy(xpath="<h27 id = Editbutton3")WebElement Editbutton3;
		@FindBy(xpath="<h28 id = Description")WebElement Description;
		@FindBy(xpath="<h29 id = Yes Option")WebElement Yes;
		@FindBy(xpath="<h30 id = No Option")WebElement No;
		@FindBy(xpath="<h31 id = Row deleted")WebElement RowDeleted;
		@FindBy(xpath="<h32 id = Delete 3")WebElement DeleteButton3;
		@FindBy(xpath="<h33 id = Row to be deleted1")WebElement Rowtodelete;
		@FindBy(xpath="<h34 id = Row to be deleted2")WebElement Rowtodelete2;
		@FindBy(xpath="<h35 id = Navigation Bar")WebElement NavigationBar;
		@FindBy(xpath="<h36 id = User Button")WebElement Userbutton;
		
		
		private WebElement TableUpdated;
		
		
			
		
	 public void clickuser() {
		 ManageUser.click();
	 }
		 
		 public void ManageUser1() {
			 if (isManageUserInURL(driver1)) {
		            System.out.println("Admin sees 'Manage User' in the URL.");
		        } else {
		            System.out.println("Admin does not see 'Manage User' in the URL.");
		        }
		 }
		 
		 public void ValidateManageUserPage()
		 {
	    driver.findElement(By.xpath("h24 id = Manager User Header"));
	    ManageUser.click();
         }
		
		 public void NavigationBar() {
	     WebElement Userbutton = driver.findElement(By.linkText("User"));
	     Userbutton .click();	 
		 }

		 
		 protected abstract boolean isManageUserInURL(WebDriver driver12);

		public void Validatepagination()
		 {
		Pagination = driver.findElement(By.id("pagination-controls")); 
		Pagination.click();
		 }
		 
		 
		 public void Validatedatatable()
		 {
			 ManageUserTable.findElement(By.xpath("h25 id = Manager User Table"));	
		 }
		 
		 
		 public void Validatedeletedisable()
		 {
		 Deletebutton = driver.findElement(By .id("Deletebutton"));
		 Deletebutton.click();
		 
		 }
		 
		 
	     public void Addnewuser()
	     {
	    	 Addnewuser.findElement(By.xpath("h1 id = '+  Add New User")).isEnabled();
	    	 Addnewuser.click();

	     }
	     
	     
	 
		 public void Validateaddbutton2()
		 {
		 Assignstaff = driver.findElement(By .linkText("+A Assign Staff"));  
		 Assignstaff.click();
		}
	 
		 
		 public void Validatesearchbox() 
		
		 {
			SearchOption = driver.findElement(By.linkText("'Search'"));	 
		 }

	     
		 public abstract void Validatecheckbox();
		 {
			 
			 Checkbox1 = driver.findElement(By.xpath("'h4 id = Checkbox1'"));	
			 Checkbox1.click();
		 }
		 
		 
		 public void Editenable() {
	    	 driver.findElement(By.xpath("h9 id = Editbutton1")).isEnabled();
	    	 Editbutton1.click();
	    	 
		
			}
		 
		 
		 public void Deletenable() {
			 driver.findElement(By.xpath("h11 id = Deletebutton1")).isEnabled();	
		 }
		 
		 
		 public void ValidatePopup() {
			 
			
			 WebElement  triggerElement = driver.findElement(By.xpath("Addnewuser"));
		        triggerElement.click();

		 WebElement popupElement = driver.findElement(By.xpath("h14 id = Pop Up"));
		        Assert.assertTrue(popupElement.isDisplayed());
		 }
		        
		        
		        public void Validatefield()  {
		    

		 Assert.assertTrue(driver.findElement(By.id("firstName")).isDisplayed(), 
		 Assert.assertTrue(driver.findElement(By.id("middleName")).isDisplayed(), 
		 Assert.assertTrue(driver.findElement(By.id("lastName")).
		 Assert.assertTrue(driver.findElement(By.id("location")).isDisplayed(), 
		 Assert.assertTrue(driver.findElement(By.id("phone")).isDisplayed(), 
		 Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed(), 
		 Assert.assertTrue(driver.findElement(By.id("linkedinUrl")).isDisplayed(),
		 Assert.assertTrue(driver.findElement(By.id("undergraduate")).isDisplayed(), 
		 Assert.assertTrue(driver.findElement(By.id("postgraduate")).isDisplayed(), 
		 Assert.assertTrue(driver.findElement(By.id("timeZone")).isDisplayed(),
		 Assert.assertTrue(driver.findElement(By.id("userComments")).isDisplayed();
				 
		}
      	
		        
		        public void fillallfields()  
		        {   
		   
		     driver.findElement(By.id("firstName")).sendKeys("Raj");
		     driver.findElement(By.id("middleName")).sendKeys("Dev");
		     driver.findElement(By.id("lastName")).sendKeys("Peter");
		     driver.findElement(By.id("location")).sendKeys("New York");
		     driver.findElement(By.id("phone")).sendKeys("1234567890");
		     driver.findElement(By.id("email")).sendKeys("Rajdev@example.com");
		     driver.findElement(By.id("linkedinUrl")).sendKeys("https://www.linkedin.com/in/Rajsh");
		     driver.findElement(By.id("undergraduate")).sendKeys("Bachelor's in Computer Science");
		     driver.findElement(By.id("postgraduate")).sendKeys("Master's in Business Administration");
		     driver.findElement(By.id("timeZone")).sendKeys("EST");
		     driver.findElement(By.id("userComments")).sendKeys("This is a test user comment");
		     
		     
		        }   
		     
		     public void submitbutton1() 
		     {
		    	 Submit = driver.findElement(By.xpath("'h22 id = Submit'"));	
				 Submit.click();
		        }    
		     
		     public void Cancelbutton() 
		     {
		    	 Cancel = driver.findElement(By.xpath("'h23 id = Submit'")); 
		     }

		      
		     
		     public void ValidateNewUser() 
		        {
	         
		    	 WebElement dataTable = driver.findElement(By.xpath ("h25 id = Manager User Table)"));

		    
		        String newUserFullName = "Raj Peter"; 
		        String newUserEmail = "Rajdev@example.com"; 

		        String expectedUserInfo = newUserFullName + " - " + newUserEmail;

		        boolean isNewUserInDataTable = dataTable.getText().contains(expectedUserInfo);

		        // Assert that the new user is present in the data table
		        Assert.assertTrue(isNewUserInDataTable);
		    }
			 
		     public void Editenable1() {
		    	 driver.findElement(By.xpath("h9 id = Editbutton1")).isEnabled();
		    	 Editbutton1.click();
		    	 
			
				}
			 
			 
		     public void ValidateNovalue() 
		     {
		    	 FirstName.sendKeys(""); //Empty First Name
		         Submit.click();

		         WebElement FirstNameError = driver.findElement(By.id("firstNameError"));
		        Assert.assertTrue(FirstNameError.isDisplayed());
		     }  
		     
		     
		     public void Editenable2() {
		    	 driver.findElement(By.xpath("h9 id = Editbutton1")).isEnabled();
		    	 Editbutton2.click();
		    	 
			
				}
			 
		     
		     public void  InvalidValue()
		     {
		    	 Email.sendKeys("Rajvcd@vdb@vv@"); //Ivalid Value In email address field
		         Submit.click();

		         WebElement FirstNameError = driver.findElement(By.id("firstNameError"));
		        Assert.assertTrue(FirstNameError.isDisplayed()); 
		 
		     }
		      
		     public void Editenable3() {
		    	 driver.findElement(By.xpath("h9 id = Editbutton1")).isEnabled();
		    	 Editbutton3.click();
		    	 
			
				}
			 

		     public void  NoDescriptionValue()
		     {
		    	 Description.sendKeys(""); //no description In description field
		         Submit.click();

		     String updatedUserDescription = updatedUserDescription.findElement(By.xpath("h28 id = Description")).getText();
		      Assert.assertTrue(TableUpdated.isDisplayed());
		     }
   
		 
		     public void  deleteenable1()
		     {
		    driver.findElement(By.xpath("h3 id = Delete button")).isEnabled();
		  
		    Deletebutton1.click();
		     }
		    
	 
		    public void  Alertwithyesorno()
		    {
		    	Alert alert = driver.switchTo().alert();
		        alert.getText().contains("Yes");
		        alert.getText().contains("No");
		    }
				
		    public void  Delete1()
		    {
		    driver.findElement(By.xpath("h3 id = Delete button")).isEnabled();
		    Deletebutton2.click();
		    }
		    
		    public void  YesOption()
		    {
		   driver.findElement(By.xpath("h29 id = Yes Option")).isEnabled();
		   Yes.click();
		    }
		    
		    public void  alertpopdeletedandnouser()
		    {
		    Alert alert = driver.switchTo().alert();
		    String alertText = alert.getText();
		    Assert.assertTrue(alertText.contains("User deleted"), "The 'User deleted' alert is displayed.");

		    alert.accept();

		     WebElement userRow = driver.findElement(By.xpath("h31 id = Row deleted")); 
		     Assert.assertFalse(userRow.isDisplayed(), "The user is no longer available in the data table.");
		    }
		    
		    public void  Delete2()
		    {
		    driver.findElement(By.xpath("h3 id = Delete button")).isEnabled();
		    DeleteButton3.click();
		    }
		    
		    public void  NoOption()
		    {
		   driver.findElement(By.xpath("h29 id = Yes Option")).isEnabled();
		   No.click();
		    }
		    
		    public void  UserStillpresent()
		    {
		   WebElement userRow = driver.findElement(By.xpath("h31 id = Row deleted")); 
           boolean isUserPresent = userRow.isDisplayed();
		    }
		    
		    
		    public void  NoCheckboxSelected()
		    {
		    List<WebElement> Checkbox1 = driver.findElements(By.xpath("h4 id = Checkbox1"));
             for (WebElement checkbox : Checkbox1) {
		            if (checkbox.isSelected()) {
		                break;
		            }
		        }
		    }
		    
		    
		    public void  deleteicondisable()
		    {
		     DeleteButton3 = driver.findElement(By.xpath("h3 id = Delete button"));
             DeleteButton3.getAttribute("disabled");
	
		    }
		    
		    public void  Onecheckboxseleted()
		    {
		    	List<WebElement> Checkbox1 = driver.findElements(By.xpath("h4 id = Checkbox1"));

		        // Check if any checkbox or row is selected
		        boolean isAnyCheckboxOrRowSelected = false;

		        for (WebElement element : Checkbox1) {
		            if (element.isSelected()) {
		                isAnyCheckboxOrRowSelected = true;
		                break;
		            }
		        }
		            
		    }
		        
		        
		        public void  Clickdelete() {
		     Deletebutton = driver.findElement(By.xpath("'h6 id = Delete Button'")); 
		     Deletebutton.click();
		        }
		        
		       public void  Datatablerowdeleted() 
		       {
		    boolean isRowDeleted = !Rowtodelete.isDisplayed(); 
		    Assert.assertTrue(isRowDeleted, "The row has been deleted from the data table."); 
		     }
		       
		       
		       public void  morerowdeleted() 
		       {
		    	   for(int i=2;i<=rowsCount;i++) {
		     Checkbox1=driver.findElement(By.xpath("h4 id = Checkbox1"));
		    	   }
             }
		    	  
		   public void  Clickdelete1() {
		  		Deletebutton = driver.findElement(By.xpath("'h6 id = Delete Button'")); 
		  		Deletebutton.click();
		  		        }
		   
		   public void  Datatablerowdeleted2() 
	       {
	    boolean isRowDeleted = !Rowtodelete.isDisplayed(); 
	    Assert.assertTrue(isRowDeleted, "The row has been deleted from the data table."); 
		       
    }
    }
		    
		    
		    
		    

				

		
	
	

	
	
