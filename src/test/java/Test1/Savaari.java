package Test1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page1.Cab;
//import tpage.SoloCabPage;

public class Savaari
{
	WebDriver driver;
	@BeforeTest
	public void setvalues()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.savaari.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void Cabs() throws IOException  
	{
	 Cab b=new Cab(driver);
	 b.login();
	 b.fromdate();
	 
	}
	@AfterMethod
	public void ends()
	{
		
	}

}
