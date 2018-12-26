package Dotballpageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createNewTeam {
	public static WebElement element;
	public static By listMatchCard = By.xpath("//div[@class='matchCard']/div/div[2]/p");
	public static By optionFirstMatchCard = By.cssSelector("div:nth-child(3) > div > div.details");
	public static By teamNameValue = By.xpath("//div[@class='team']/div[1]/p");
	public static By myTeamOption = By.xpath("//*[@class='navbar']/div[1]/label");
	public static By btnCreateTeam = By.xpath("//div[@class='add-btn']/p");
	public static By wicketKeeperList = By.xpath("//*[@class='ant-table-tbody']/tr[2]/td[4]/span/i");
	public static By tabBat = By.xpath("//*[@class='player-split']/li[2]/p");
	public static By selectBatsmen1 = By.xpath("//*[@class='ant-table-tbody']/tr[1]/td[4]/span");
	public static By selectBatsmen2 = By.xpath("//*[@class='ant-table-tbody']/tr[2]/td[4]/span");
	public static By selectBatsmen3 = By.xpath("//*[@class='ant-table-tbody']/tr[10]/td[4]/span");
	public static By selectBatsmen4 = By.xpath("//*[@class='ant-table-tbody']/tr[11]/td[4]/span");
	public static By selectBatsmen5 = By.xpath("//*[@class='ant-table-tbody']/tr[12]/td[4]/span");
	public static By tabBowl = By.xpath("//*[@class='player-split']/li[3]/p");
	public static By selectBowerls1 = By.xpath("//*[@class='ant-table-tbody']/tr[4]/td[4]/span");
	public static By selectBowerls2 = By.xpath("//*[@class='ant-table-tbody']/tr[5]/td[4]/span");
	public static By selectBowerls3 = By.xpath("//*[@class='ant-table-tbody']/tr[6]/td[4]/span");
	public static By tabAr = By.xpath("//*[@class='player-split']/li[4]/p");
	public static By selectAllRounder1 = By.xpath("//*[@class='ant-table-tbody']/tr[3]/td[4]/span");
	public static By selectAllRounder2 = By.xpath("//*[@class='ant-table-tbody']/tr[4]/td[4]/span");
	public static By btnNext = By.xpath("//*[@class='proceed_btn btn']");
	public static By selectCaptain = By.xpath("//*[@class='ant-table-tbody']/tr[1]/td[3]/div/span[1]");
	public static By selectVCaptain = By.xpath("//*[@class='ant-table-tbody']/tr[2]/td[3]/div/span[2]");
	public static By btnSave = By.xpath("//*[@class='proceed_btn btn'][text()='SAVE']");
	
	public static WebElement clickMatchCard(WebDriver driver){	
		List<WebElement> matchCardList = driver.findElements(listMatchCard);
		for(WebElement element:matchCardList)
		{
		System.out.println(element.getText());
		}
		element = driver.findElement(optionFirstMatchCard);
		return element;	
	}
	
	public static String displaySelectedTeam(WebDriver driver){
		String TeamName = driver.findElement(teamNameValue).getText();
		return TeamName;
	}
	
	public static WebElement clickMyTeam(WebDriver driver){
		element = driver.findElement(myTeamOption);
		return element;	
	}
	
	public static WebElement clickCreateTeam(WebDriver driver){
		element = driver.findElement(btnCreateTeam);
		return element;	
	}
	
	public static WebElement selectWicketKeeperList(WebDriver driver){
		element = driver.findElement(wicketKeeperList);
		return element;	
	}
	
	public static WebElement clickBatTab(WebDriver driver){
		element = driver.findElement(tabBat);
		return element;	
	}
	
	public static WebElement selectBatsmen1(WebDriver driver){
		element = driver.findElement(selectBatsmen1);
		return element;	
	}
	
	public static WebElement selectBatsmen2(WebDriver driver){
		element = driver.findElement(selectBatsmen2);
		return element;	
	}
	public static WebElement selectBatsmen3(WebDriver driver){
		element = driver.findElement(selectBatsmen3);
		return element;	
	}
	public static WebElement selectBatsmen4(WebDriver driver){
		element = driver.findElement(selectBatsmen4);
		return element;	
	}
	public static WebElement selectBatsmen5(WebDriver driver){
		element = driver.findElement(selectBatsmen5);
		return element;	
	}
	
	public static WebElement clickBowlTab(WebDriver driver){
		element = driver.findElement(tabBowl);
		return element;	
	}
	
	public static WebElement selectBowlrs1(WebDriver driver){
		element = driver.findElement(selectBowerls1);
		return element;	
	}
	
	public static WebElement selectBowlrs2(WebDriver driver){
		element = driver.findElement(selectBowerls2);
		return element;	
	}
	public static WebElement selectBowlrs3(WebDriver driver){
		element = driver.findElement(selectBowerls3);
		return element;	
	}
	
	public static WebElement clickArTab(WebDriver driver){
		element = driver.findElement(tabAr);
		return element;	
	}
	public static WebElement selectAR1(WebDriver driver){
		element = driver.findElement(selectAllRounder1);
		return element;	
	}
	public static WebElement selectAR2(WebDriver driver){
		element = driver.findElement(selectAllRounder2);
		return element;	
	}
	
	public static WebElement clickNextBtn(WebDriver driver){
		element = driver.findElement(btnNext);
		return element;	
	}
	
	public static WebElement selectCaptain(WebDriver driver){
		element = driver.findElement(selectCaptain);
		return element;	
	}
	
	public static WebElement selectVCaptain(WebDriver driver){
		element = driver.findElement(selectVCaptain);
		return element;	
	}
	
	public static WebElement clickSaveBtn(WebDriver driver){
		element = driver.findElement(btnSave);
		return element;	
	}
}