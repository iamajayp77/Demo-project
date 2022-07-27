package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepositery.RediffMail;

public class LoginTestCases 
{
	void openPage(WebDriver driver) 
	{
		String url = "https://register.rediff.com/register/register.php?FormName=user_details";
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	void fNameTestCase(RediffMail p)
	{
		p.fullname().sendKeys("AJAY B. PAWAR");
	}
	
	
	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginTestCases test= new LoginTestCases();
		
		RediffMail p = new RediffMail(driver);
		
		test.openPage(driver);
		test.fNameTestCase(p);
		

	}

}
