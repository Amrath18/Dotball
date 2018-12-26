package Dotballtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Dotballpageobjects.LoginPage;
import Dotballpageobjects.SignUpPage;
import Dotballpageobjects.createContests;
import Dotballpageobjects.createNewTeam;

public class dotBallTestClass {
public static WebDriver driver;
	
	
	@BeforeTest
	public void browserLaunch(){
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUMDRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dotball.com");
		System.out.println("Dotball application has been launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	//AC01: Verify that user is able to Signup the Dotball application with valid details.
	public void userAbleToSignUpDBApp(){
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		SignUpPage.userSignUp(driver).click();
		System.out.println("Application Title: " +SignUpPage.getPageTitle(driver));
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		SignUpPage.enterProfileName(driver).sendKeys("Test User");
		SignUpPage.entermobileNo(driver).sendKeys("9008048250");
		SignUpPage.enterNewPassword(driver).sendKeys("Testuser");
		SignUpPage.clickSignUp(driver).click();
		System.out.println("User is already Registered");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	
	@Test(priority=2)
	//AC01: SignUp page field validation
	public void profileNameValidation(){
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		SignUpPage.enterProfileName(driver).clear();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		SignUpPage.enterProfileName(driver).sendKeys("1234");
		String actProError= SignUpPage.actProNameNumericError(driver);
		String expProNameNumericError = "Enter a valid User name";
		if(actProError.contains(expProNameNumericError)) 
		{
		    System.out.println("Test Case Passed:Enter Profile Name field contains the numeric values");
		}else
		{
		    System.out.println("Test Case Failed");
		};	
		//Enter Profile Name field with Special characters and validate the error message:
		SignUpPage.enterProfileName(driver).clear();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		SignUpPage.enterProfileName(driver).sendKeys("@#$$$");
		String expProNameSpeCharError = "Enter a valid User name";
		if(actProError.contains(expProNameSpeCharError)) 
		{
		    System.out.println("Test Case Passed:Enter Profile Name field contains the special characters");
		}else
		{
		    System.out.println("Test Case Failed");
		};
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.quit();
	}

	@Test(priority=3)
	//AC02: Verify that user is able to Login the Dotball application with valid details.
	public void userAbleToLogin(){
		browserLaunch();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		LoginPage.clickLoginLink(driver).click();
		String LoginPageTitle = driver.getTitle();
		System.out.println("Application Title: " +LoginPageTitle);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		LoginPage.entermobileNo(driver).sendKeys("9008048520");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Click on SignIn button
		driver.findElement(By.cssSelector("div.signupWrapper > div.proceed_btn.btn")).click();
		//Enter valid password
		driver.findElement(By.cssSelector(".signupWrapper>div.inputWrapper>input[type='password']")).sendKeys("Akki1234");
		//Click on SignIn button
		driver.findElement(By.cssSelector("div.signupWrapper > div.proceed_btn.btn")).click();
		System.out.println("Login Successful");
	}
	
	@Test(priority=4)
	//AC03: Verify that user is able to create a Team.
	public void createTeam(){
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		createNewTeam.clickMatchCard(driver).click();
		System.out.println("Selected Team: " +createNewTeam.displaySelectedTeam(driver));
		createNewTeam.clickMyTeam(driver).click();
		createNewTeam.clickCreateTeam(driver).click();
		createNewTeam.selectWicketKeeperList(driver).click();
		createNewTeam.clickBatTab(driver).click();
		createNewTeam.selectBatsmen1(driver).click();
		createNewTeam.selectBatsmen2(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement batOption = createNewTeam.selectBatsmen3(driver);
		js.executeScript("arguments[0].scrollIntoView();",batOption);
		createNewTeam.selectBatsmen3(driver).click();
		createNewTeam.selectBatsmen4(driver).click();
		createNewTeam.selectBatsmen5(driver).click();
		createNewTeam.clickBowlTab(driver).click();
		createNewTeam.selectBowlrs1(driver).click();
		js.executeScript("window.scrollBy(0,1000)");
		createNewTeam.selectBowlrs2(driver).click();
		createNewTeam.selectBowlrs3(driver).click();
		createNewTeam.clickArTab(driver).click();
		js.executeScript("window.scrollBy(0,1000)");
		createNewTeam.selectAR1(driver).click();
		createNewTeam.selectAR2(driver).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		createNewTeam.clickNextBtn(driver).click();
		createNewTeam.selectCaptain(driver).click();
		createNewTeam.selectVCaptain(driver).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//createNewTeam.selectBatsmen5(driver).click();
		System.out.println("Squad already exists");
		driver.quit();
	}
	
	@Test(priority=5)
	//AC04: Verify that user is able to Join the contest.
	public void UserJoinContest() throws Exception{
		userAbleToLogin();
		createNewTeam.clickMatchCard(driver).click();
		createContests.SelectEntryFee(driver).click();
		createContests.enterAmount(driver).clear();
		createContests.enterAmount(driver).sendKeys("10");
		createContests.ClickOnProceed(driver).click();
		Thread.sleep(1000);
		createContests.enterCardNo(driver).sendKeys("9988777");
		Thread.sleep(2000);
		createContests.enterCardHolderName(driver).sendKeys("Test User");
		createContests.selectMonth(driver);
		createContests.selectYear(driver);
		createContests.enterCVV(driver).sendKeys("458");
		createContests.clickPay(driver).click();
		System.out.println("Display the warning message: " +createContests.getErrorText(driver));
		driver.quit();
	}
	}


		