package Test1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Thomascook
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
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
}
@Test
public void login() 
{


}
@AfterMethod
public void ends()
{
	
}

}
