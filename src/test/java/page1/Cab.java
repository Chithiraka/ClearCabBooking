package page1;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cab 
{
	WebDriver driver;
	By log=By.xpath("//header/div[1]/div[3]/div[1]/span[1]");
	By Username=By.xpath("//*[@id=\"approot\"]/app-navbar/div[3]/div/div[2]/form/input[1]");
	By Password=By.xpath("//*[@id=\"approot\"]/app-navbar/div[3]/div/div[2]/form/input[2]");
	By logs=By.xpath("//*[@id=\"approot\"]/app-navbar/div[3]/div/div[2]/form/div[2]/button[1]");
	By Froms=By.xpath("//*[@id=\"fromCityList\"]");
	//By To=By.xpath("");
	
	
	public Cab(WebDriver driver)
	{
		this.driver=driver;
	}
	public void login() throws IOException  
	{
		/*File f=new File("D:\\Book3.xlsx");
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
	      driver.findElement(By.xpath("//*[@id=\\\"approot\\\"]/app-navbar/div[3]/div/div[2]/form/input[1]")).clear();
	      driver.findElement(By.xpath("//*[@id=\\\"approot\\\"]/app-navbar/div[3]/div/div[2]/form/input[1]")).sendKeys(Username);
	      driver.findElement(By.xpath("//*[@id=\\\"approot\\\"]/app-navbar/div[3]/div/div[2]/form/div[4]/button[1]")).clear();
	      driver.findElement(By.xpath("//*[@id=\\\"approot\\\"]/app-navbar/div[3]/div/div[2]/form/div[4]/button[1]")).sendKeys(pswd);
	      driver.findElement(logs).click();

        }*/
		driver.findElement(log).click();
		driver.findElement(Username).sendKeys("chithiraayyappankutty96@gmail.com");
		driver.findElement(Password).sendKeys("Chithira123@");
		driver.findElement(logs).click();
	}
		public void fromdate()
		{
			for (int i = 1; i < 3; i++) {
		           driver.findElement(By.id("fromCityList")).sendKeys(Keys.ARROW_DOWN);
		           System.out.println("Pressing down arrow key to reach " + i + " search term");
		       }
		       System.out.println("Hitting enter key on the required search term");
		       driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);


		       // wait for the search results page to load and verify if it has the same term as we
		       // expected.
		       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Froms)));
		       System.out.println(
		    		   "Search term on results page: " + driver.findElement(By.xpath("//*[@type='search']")).getText());


		       // verify that search term on results page consists of the initial input term given
		       Assert.assertEquals(driver.findElement(By.xpath("//*[@type='search']")).getText().contains("lambdatest"), true,
		               "Valid Search result page.");
		       System.out.println("Reached to search result page for given term");
		   }
		}
		}
		
}
		

