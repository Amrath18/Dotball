package Dotballpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createContests {
	public static WebElement element;
	public static By selectEntryFee = By.cssSelector("div:nth-child(2) > div.cardWrapper.unactive > div > div.button-sec > div");
	public static By selectAmountOption = By.cssSelector("div.choose_money > div > span:nth-child(1)");
	public static By btnProceed = By.xpath("//*[@class='proceed_btn btn'][text()='PROCEED']");
	public static By txtEnterMoney = By.xpath("//input[@type='number'][@class='input_box']");
	public static By btnProceed1 = By.xpath("//div[@class='proceed_btn btn'][text()='PROCEED']");
	public static By txtCardNumber = By.xpath("//input[@class='form-control card-input']");
	public static By txtCardHolderName = By.xpath("//input[@class='form-control card-holder']");
	//public static By ddlMonth = By.cssSelector("div:nth-child(6) > select.form-control.card-mm");
	//public static By ddlYear = By.cssSelector("div:nth-child(6) > select.form-control.card-yy");
	public static By txtCVV = By.cssSelector("div:nth-child(6) > input");
	public static By btnPay = By.cssSelector("#credit-form > button");
	//public static By txtErrorMessage = By.xpath("");
	
	
	public static WebElement SelectEntryFee(WebDriver driver){
		element = driver.findElement(selectEntryFee);
		return element;	
	}
	
	public static WebElement enterAmount(WebDriver driver){
	element = driver.findElement(txtEnterMoney);
	return element;	
	}	
	
	public static WebElement ClickOnProceed(WebDriver driver){
		element = driver.findElement(btnProceed);
		return element;	
	}
	
	public static WebElement enterCardNo(WebDriver driver){
		element = driver.findElement(txtCardNumber);
		return element;	
	}
	
	public static WebElement enterCardHolderName(WebDriver driver){
		element = driver.findElement(txtCardHolderName);
		return element;	
	}
	
	public static void selectMonth(WebDriver driver){
		Select month = new Select(driver.findElement(By.cssSelector("div:nth-child(6) > select.form-control.card-mm")));
		//return (WebElement) month;
		month.selectByVisibleText("02 (Feb)");
	}
	
	public static void selectYear(WebDriver driver){
		Select month = new Select(driver.findElement(By.cssSelector("div:nth-child(6) > select.form-control.card-yy")));
		//return (WebElement) month;
		month.selectByVisibleText("2020");
	}
	
	public static WebElement enterCVV(WebDriver driver){
		element = driver.findElement(txtCVV);
		return element;	
	}
	
	public static WebElement clickPay(WebDriver driver){
		element = driver.findElement(btnPay);
		return element;	
	}
	
	public static String getErrorText(WebDriver driver){
		return driver.findElement(By.xpath("//span[text()='Please enter a valid card number']")).getText();	
	}

}
