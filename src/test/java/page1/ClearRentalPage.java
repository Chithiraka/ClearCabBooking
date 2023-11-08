package page1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.List;
import java.util.logging.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ClearRentalPage {
	WebDriver driver;
	By sign =By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[4]");
	By Username=By.xpath("//*[@id=\"SignForm\"]/div[1]/input");
	By Password=By.xpath("//*[@id=\"SignForm\"]/div[2]/input");
	By login=By.xpath("//*[@id=\"SignForm\"]/div[3]/input");
	By booking=By.xpath("/html[1]/body[1]/div[1]/ul[2]/li[2]/a[1]");
	By books=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]");
	By From=By.xpath("//*[@id=\"sourceCity4\"]");
	By To=By.xpath("//*[@id=\"destinationCity4\"]");
	By monthinspect=By.xpath("//*[@id=\"datepicker\"]");
	By currentmonth=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
	By currentyear=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");
	By arrowbutton=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td");
	By fulldate =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]");
	By time=By.xpath("//*[@id=\"timePickExample\"]");
	By times=By.xpath("//*[@id=\"tripTime\"]/div/span/ul");
	By search=By.xpath("//*[@id=\"buttonDiv\"]/button");
	
	public ClearRentalPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Titleverification()
	{
		String actualtitles=driver.getTitle();
		System.out.println(actualtitles);
		String expectedtitle="Cochin local car rentals local cabs taxi services, Cochin online cab booking, hire a car in Cochin";
		if(actualtitles.equals(expectedtitle))
		{	
			System.out.println("pass");	
		}
		else
		{
			System.out.println("fail");
		}
	}
		public void contentverification()
		{
			String cont=driver.getPageSource();
			
			if(cont.contains("Enquiry"))
			{
				System.out.println("contains");	
			}
			else
			{
				System.out.println(" not contains");		
			}
		}
			public void scrolldown() throws Exception
			{
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				driver.findElement(By.xpath("//a[contains(text(),'Covid-19 Guidelines')]")).click();
			}
			 public void scr() throws Exception
			 {
				File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//FileHandler.copy(s,new File("D:\\scrnshot.png"));
				FileUtils.copyFile(s,new File("D:\\scrnshot.png"));
				 
			 }
		public void firsttest()
		{
			driver.findElement(sign).click();
		}
		public void datadrivern() throws IOException
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
	      driver.findElement(By.xpath("//*[@id=\"SignForm\"]/div[1]/input")).clear();
	      driver.findElement(By.xpath("//*[@id=\"SignForm\"]/div[1]/input")).sendKeys(Username);
	      driver.findElement(By.xpath("//*[@id=\"SignForm\"]/div[2]/input")).clear();
	      driver.findElement(By.xpath("//*[@id=\"SignForm\"]/div[2]/input")).sendKeys(pswd);
	      driver.findElement(login).click();
        }
		}
		public void booking()
		{
			
			driver.findElement(booking).click();
			driver.findElement(books).click();
		}
	
	
	public void fromTest() throws InterruptedException 
	{	
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(70));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("sourceCity4"))).clear();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sourceCity4")));
		driver.findElement(By.id("sourceCity4")).sendKeys("Cochin",Keys.ENTER);
		
	}
	
	public void totest()throws Exception
	{
		    WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(70));
		    wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("destinationCity4"))).clear();
		   
		    driver.findElement(By.name("destinationCity")).sendKeys("Alappuzha");
		    WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(10));
		    //driver.findElement(By.name("destinationCity")).click();
		    wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("destinationCity4")));
		   
			
		    
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void date()
	{
		driver.findElement(monthinspect).click();
		
		WebElement year = driver.findElement(currentyear);
		Select selectYear= new Select(year);
		selectYear.selectByVisibleText("2024");
		
		WebElement month = driver.findElement(currentmonth);
				Select selectMonth= new Select(month);
				selectMonth.selectByVisibleText("Feb");
				
				
	List<WebElement>alldates=driver.findElements(fulldate);
	for(WebElement dateelement:alldates)
	{
		String date=dateelement.getText();
		System.out.println(date);
		if(date.equals("1"))
		{
			dateelement.click();
			break;
		}
	}
}
   public void timetest()
   {
		driver.findElement(time).click();
		String searchText = "08 : 00 PM";
		System.out.println(searchText);
		WebElement dropdown = driver.findElement(By.xpath("//li[contains(text(),'08 : 00 PM')]"));
		dropdown.click(); 

	
   }
   public void searchtest()
   {
	 driver.findElement(search).click();  
   
   }
   public void  navigate()
   {
	   driver.navigate().back();
	   driver.navigate().back();
	   driver.navigate().back();
	   driver.navigate().back();
	   driver.navigate().back();
	   driver.navigate().back();
	   
	   
   }
   public void signout()
   {
	   driver.navigate().refresh();
	   driver.navigate().refresh();
	   driver.navigate().refresh();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/span[1]")).click();
	  driver.navigate().refresh();
	   driver.navigate().refresh();
	  //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/span[1]")).click();
	 // driver.navigate().refresh();
	  // driver.navigate().refresh();
	//  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/span[1]")).click();
	//  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/span[1]")).click();
	//  driver.navigate().refresh();
	//   driver.navigate().refresh();
   }
   
   
}


