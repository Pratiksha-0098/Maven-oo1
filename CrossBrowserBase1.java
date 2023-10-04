package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.LoginVtigerPage1;

public class CrossBrowserBase1
{
	WebDriver driver;
	
	@Test
	public void vtiger() throws IOException, InterruptedException
	{
	
	FileInputStream fis=new FileInputStream("src\\test\\resources\\Vtiger1.properties");
	Properties p= new Properties();
	
	p.load(fis);
	String BROWSER = p.getProperty("browser");
	
	if(BROWSER.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equals("FireFox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		driver=new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	String URL = p.getProperty("url");
	String NAME = p.getProperty("CampaignName");
	String SIZE = p.getProperty("TargetSize");
	String DATE = p.getProperty("Date");
	String AUDIENCE = p.getProperty("audience");
	String SPONSER = p.getProperty("sponser");
	String NUMSET = p.getProperty("numsent");
	String BUDGETCOST = p.getProperty("budgetcost");
	String ACTUALCOST = p.getProperty("actualcost");
	String REVENUE = p.getProperty("expectedrevenue");
	String SALESCOUNT = p.getProperty("expectedsalescount");
	String ASALESCOUNT = p.getProperty("actualsalescount");
	String ERCOUNT = p.getProperty("Expectedresponsecount");
	String ARCOUNT = p.getProperty("actualresponsecount");
	String EROI = p.getProperty("expectedroi");
	String AROI = p.getProperty("actualroi");
	String DESCRIPTION = p.getProperty("description");
	
	driver.get(URL);

		
	LoginVtigerPage1 lvp=new LoginVtigerPage1();
	PageFactory.initElements(driver, lvp);
	lvp.getLoginbtn().click();
	lvp.getThreelines().click();
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.moveToElement(lvp.getMarketing()).perform();
	lvp.getMarketing().click();
	lvp.getCampaigns().click();
	lvp.getAddcampaign1().click();
	lvp.getCampignName().sendKeys(NAME);
	lvp.getTargetsize().sendKeys(SIZE);
	lvp.getDate().sendKeys(DATE);
	lvp.getDate().sendKeys(Keys.ENTER);
	lvp.getAudience().sendKeys(AUDIENCE);
	lvp.getSponser().sendKeys(SPONSER);
	lvp.getNumsent().sendKeys(NUMSET);
	lvp.getBudgetcost().sendKeys(BUDGETCOST);
	lvp.getActualcost().sendKeys(ACTUALCOST);
	lvp.getExpectedrevenue().sendKeys(REVENUE);
	lvp.getExpectedsalescount().sendKeys(SALESCOUNT);
	lvp.getActualsalescount().sendKeys(ASALESCOUNT);
	lvp.getExpectedresponsecount().sendKeys(ERCOUNT);
	lvp.getActualresponsecount().sendKeys(ARCOUNT);
	lvp.getExpectedroi().sendKeys(EROI);
	lvp.getActualroi().sendKeys(AROI);
	lvp.getDescription().sendKeys(DESCRIPTION);
	
	
	
	
	
	
	

}
}