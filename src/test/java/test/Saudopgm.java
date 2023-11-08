package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Saudemo;
//import org.testng.annotations.Test;
public class Saudopgm
{
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		Saudemo f=new Saudemo(driver);
		f.setvalues("standard_user","secret_sauce" );
		f.login();
		f.Addtocart();
		f.cart1();
		f.checkout();
		f.reg("chithira", "KA","fkj");
		f.continuess();
		f.hamburgers();
		f.logout();
		
	}

}
