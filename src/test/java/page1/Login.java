package page1;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.time.Duration;

//import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class Login
{
	WebDriver driver;
	By log=By.xpath("//*[@id=\"LoginLogoutToggel\"]");
	By loginbutton=By.xpath("//*[@id=\"mainLogIn\"]");
	By username=By.xpath("//*[@id=\"loginId\"]");
	By password=By.xpath("//*[@id=\"existloginPass\"]");
	By login1=By.id("loginButton");
	By Hotel=By.xpath("//*[@id=\"bs-navbar\"]/ul/li[3]/a");
	By search=By.xpath("//*[@id=\"find-hotel\"]");
	By date =By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/span[1]");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void flinks() 
	{
		  driver.findElement(log).click();
		  driver.findElement(loginbutton).click();
		  
	}
	public void cook() throws IOException
	{
		  File f=new File("D:\\Book3.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet  sh=wb.getSheet("Sheet1");
			System.out.println(sh.getLastRowNum());
			for(int i=1;i<=sh.getLastRowNum();i++)
	        {
		      String Username=sh.getRow(i).getCell(0).getStringCellValue();
		      System.out.println("username="+Username);
		      String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		      System.out.println(pswd);
		      driver.findElement(By.xpath("//*[@id=\"loginId\"]")).clear();
		      driver.findElement(By.xpath("//*[@id=\"loginId\"]")).sendKeys(Username);
		      driver.findElement(By.xpath("//*[@id=\"existloginPass\"]")).clear();
		      driver.findElement(By.xpath("//*[@id=\"existloginPass\"]")).sendKeys(pswd);
		      driver.findElement(login1).click();

	        }
	}
	public void HotelBooking()
	{
	     driver.findElement(Hotel).click();
	     driver.findElement(search).sendKeys("delhi");
	     driver.navigate().refresh();
      }
	public void search()
	{
		driver.findElement(search).click();	
		
    }	
	public void test1() throws Exception 
	{
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		try
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		catch(NoAlertPresentException  ne)
		{
			System.out.println("alert ");
			ne.printStackTrace();
		}
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		try
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		catch(NoAlertPresentException  ne)
		{
			System.out.println("alert ");
			ne.printStackTrace();
		}
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();
		driver.findElement(date).click();
		alert.accept();
		
	/*while(true)
	{
		WebElement month=driver.findElement(By.xpath(""));
		//month.click();
		String month1=month.getText();
		//System.out.println(month1);
		if(month1.equals("October 2023"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			driver.findElement(By.xpath("")).click();
			
		}
	}
	/*List <WebElement> alldate1= driver.findElements();

	for(WebElement datelement:alldate1)
	{
		String date=datelement.getText();
		//System.out.println(date);
		if(date.equals("29"))
		{
			datelement.click();
			break;
		}
	}
	
}*/
}
}
	
	
