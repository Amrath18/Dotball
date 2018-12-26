package Dotballpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	public static WebElement element = null;
	public static By btnSinUp = By.xpath("//a[@class='waves-effect waves-light btn btn-signup']");
	public static By txtProfileName = By.xpath("//input[@type='text']");
	public static By txtMobileNo = By.xpath("//input[@type='number']");
	public static By txtNewPassword = By.xpath("//input[@type='password']");
	public static By btnSignUp1 = By.xpath("//div[text()='SIGN UP']");
	public static By actProNameErr = By.xpath("//p[text()='Enter a valid User name']");
	
	
	public static WebElement userSignUp(WebDriver driver){	
		element = driver.findElement(btnSinUp);
		return element;
	}
	
	public static String getPageTitle(WebDriver driver){
		String SignupPageTitle = driver.getTitle();
		return SignupPageTitle;		
	}
	
	public static WebElement enterProfileName(WebDriver driver){	
		element = driver.findElement(txtProfileName);
		return element;
	}
	
	public static WebElement entermobileNo(WebDriver driver){	
		element = driver.findElement(txtMobileNo);
		return element;
	}
	
	public static WebElement enterNewPassword(WebDriver driver){	
		element = driver.findElement(txtNewPassword);
		return element;
	}
	public static WebElement clickSignUp(WebDriver driver){	
		element = driver.findElement(btnSignUp1);
		return element;
	}
	
	public static String actProNameNumericError(WebDriver driver){
		 return driver.findElement(actProNameErr).getText();
	}
}
