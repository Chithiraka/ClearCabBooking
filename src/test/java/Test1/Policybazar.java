package Test1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page1.Bazar;

public class Policybazar
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
	driver.get("https://travel.policybazaar.com/");
	driver.manage().window().maximize();
}
@Test
public void Bazar1() throws Exception 
{
Bazar B=new Bazar(driver);
B.destinations();
//B.clicks();

}
@AfterMethod
public void ends()
{
	//driver.close();
}

}


