import java.awt.RenderingHints.Key;
import java.sql.Driver;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Term {
public static void main(String[]args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	 System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
	WebElement spicelogo = driver.findElement(By.xpath("//a[@class='spicejet_logo']"));
	boolean logo =spicelogo.isDisplayed();
	if(logo) {
		System.out.println("True"); }
		else {
			System.out.println("False");
	}
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='TRV']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
	Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	Assert.assertFalse(false);
	
	driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	Assert.assertTrue(true);
	driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")));
	
	driver.findElement(By.id("divpaxinfo")).click();
	Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	s.selectByValue("4");
	Thread.sleep(3000);
	Select b = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
	b.selectByValue("1");
	
	Select c = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
	c.selectByVisibleText("1");
	
	Select a = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	a.selectByValue("USD");
	
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	
	
	
	
	
	
	//int i ;
	//for (i=1;1<=5;i++) {
	//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys(Keys.DOWN);
	}
	//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys(Keys.ENTER);
	
	//driver.findElement(By.xpath("//span[@Class=\"flex\"]/button")).click();
	//driver.findElement(By.xpath("//buton[@Class=\"cal-btn-next\"]")).click();
	//driver.findElement(By.xpath("//time[@datetime=\"2020-08-02\"]")).click();
	
}

