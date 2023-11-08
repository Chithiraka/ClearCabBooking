package mtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mpage.Marine;

public class MTest {
	WebDriver driver;
	@BeforeTest
	public void set()
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
		Marine m1=new Marine(driver);
		m1.setvalue();
		//m1.searchb();
		m1.depart();
		m1.month1();
		m1.travels();
		
	}
}
