package tpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Roundtrip {
	WebDriver driver;
	By round=By.xpath("//*[@id=\"Three-tab\"]");
	By rpickup=By.xpath("//*[@id=\"pickup_city1\"]");
	By rdrop=By.xpath("//*[@id=\"next_destination1\"]");
	By plus=By.xpath("//body/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]");
	By next=By.xpath("//*[@id=\"next_destination2\"]");
	By back=By.xpath("//*[@id=\"content\"]/div/div/div/div/div/a/button[1]");
	
	public Roundtrip(WebDriver driver)
	{
		this.driver=driver;
	}
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(round).click();
	}
	public void rounddest(String p,String d) 
		{
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	      for (String windowHandle : driver.getWindowHandles()) {
	          driver.switchTo().window(windowHandle);
	      
			//driver.findElement(rpickup).click();
			driver.findElement(rpickup).sendKeys(p);
			//driver.findElement(rdrop).click();
			driver.findElement(rdrop).sendKeys(d);	
		//	driver.findElement(dateclick).click();		
	}

}
}
