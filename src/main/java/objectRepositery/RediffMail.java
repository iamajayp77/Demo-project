package objectRepositery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffMail 
{
	WebDriver driver;
	
	public RediffMail(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By fullName= By.xpath("//*[contains(@name,'name')]");
	By chooseMailId= By.xpath("//*[contains(@onclick,'javascript:UncheckAllOptions();')]");
	
	public WebElement fullname() {
		return driver.findElement(fullName);
	}
	
	public WebElement mailid() {
		return driver.findElement(chooseMailId);
	}
	
	

	

}
