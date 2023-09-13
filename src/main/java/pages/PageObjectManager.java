package pages;

import org.openqa.selenium.WebDriver;

import stepdefinitions.StudentPageStepDefination;

//role :  create objects for each page object and assign driver
public class PageObjectManager {
	public MainLoginPage mainLoginPage;
	public DashboardPage dashboardPage;
	public StudentPage studentPage;
	public ProgramPage programPage;
	public BatchPage batchPage;
	public ClassPage classPage;
	public UserPage userPage;
	public AssignmentPage assignmentPage;
	public AttendancePage attendancePage;
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public MainLoginPage getMainLoginPage() {
		mainLoginPage=new MainLoginPage(driver);
		return mainLoginPage;
	}
	public DashboardPage getDashboardPage() {
		dashboardPage= new DashboardPage(driver);
		return dashboardPage;
	}
	public StudentPage getStudentPage() {
		studentPage= new StudentPage();
		return studentPage;
	}
	public ProgramPage getProgramPage() {
		programPage= new ProgramPage(driver);
		return programPage;
	}
	public BatchPage getBatchPage() {
		batchPage= new BatchPage(driver);
		return batchPage;
	}
	public ClassPage getClassPage() {
		classPage= new ClassPage(driver);
		return classPage;
	}
	public UserPage getUserPage() {
		userPage= new UserPage(driver);
		return userPage;
	}
	public AssignmentPage getAssignmentPage() {
		assignmentPage= new AssignmentPage(driver);
		return assignmentPage;
	}
	public AttendancePage getAttendancePage() {
		attendancePage= new AttendancePage(driver);
		return attendancePage;
	}

	public StudentPageStepDefination getStudentPageStepDefination() {
		// TODO Auto-generated method stub
		return null;
	}

}
