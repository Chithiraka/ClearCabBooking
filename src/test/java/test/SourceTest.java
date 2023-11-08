package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Source;

public class SourceTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() //throws Exception 
	{
		Source ob1=new Source(driver);
		ob1.firstpage("standard_user", "secret_sauce");
		ob1.cartsclicks();
		ob1.swaglab("Avanthika","Saneni","mmm");
		ob1.home();
	}
	

}
