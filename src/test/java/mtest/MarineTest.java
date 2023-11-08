package mtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mpage.MarineSite;

public class MarineTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://marinersforex.com/Flights-Booking");	
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		MarineSite   ob1=new MarineSite(driver);
		ob1.setvalues("New Delhi, India" ,"Mumbai, India ");
		//ob1.login();
	}

}
