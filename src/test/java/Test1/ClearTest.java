package Test1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page1.ClearRentalPage;

public class ClearTest {

	WebDriver driver;
	@BeforeTest
	public void setvalues()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.clearcarrental.com/cochin-local-cab");
		driver.manage().window().maximize();
	}
	@Test
	public void rent() throws Exception 
	{
		ClearRentalPage c=new ClearRentalPage(driver);
		c.Titleverification();
		c.contentverification();
		c.scrolldown();
		//c.screenshot();
		c.firsttest();
		c.datadrivern();
		c.booking();
		
		c.fromTest();
	    c.totest();
		//c.fromToTest("Ernakulam","Alappuzha");
		c.date();
		c.timetest();
		c.searchtest();
		c.navigate();
		c.signout();

	 
	}
	@AfterMethod
	public void ends()
	{
			}

}
