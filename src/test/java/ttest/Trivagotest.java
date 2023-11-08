package ttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tpage.Trivago;

public class Trivagotest {
	public WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ktdcbooking.com/");
	}
	@Test
	public void testing()
	{
		Trivago t=new Trivago(driver);
		t.login();
		t.titleverification();
	}
	

}
