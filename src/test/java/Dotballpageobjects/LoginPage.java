package Dotballpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement element;
	//public static By signInOption = By.cssSelector("div.curvedstyle-wrap > div.fbWrapper > p > span");
	public static By linkLogin = By.xpath("//a[@href='https://dotball.com/Login']");
	public static By txtMobileNo = By.cssSelector("div.inputWrapper > input");
	public static By btnSignIn = By.cssSelector("div.signupWrapper > div.proceed_btn.btn");
	public static By txtPassword = By.cssSelector(".signupWrapper>div.inputWrapper>input[type='password']");
	
	
	/*public static WebElement clickSignIn(WebDriver driver){	
		element = driver.findElement(signInOption);
		return element;
	}*/
	
	public static WebElement clickLoginLink(WebDriver driver){	
		element = driver.findElement(linkLogin);
		return element;
	}
	
	public static WebElement entermobileNo(WebDriver driver){	
		element = driver.findElement(txtMobileNo);
		return element;
	}
	
	public static WebElement SignINClick(WebDriver driver){	
		element = driver.findElement(btnSignIn);
		return element;
	}
	public static WebElement enterNewPassword(WebDriver driver){	
		element = driver.findElement(txtPassword);
		return element;
	}
}
