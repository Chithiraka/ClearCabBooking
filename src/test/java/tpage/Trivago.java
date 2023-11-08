package tpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Trivago {
	WebDriver driver;
	By log=By.cssSelector("div[class='settings-padding']");
	public  Trivago(WebDriver driver)
	{
		this.driver=driver;
	}
	public void login()
	{
		driver.findElement(log).click();;
	}
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="trivago.in - Compare hotel prices worldwide";
		if(actualtitle.equals(expectedtitle))	
			System.out.println("pass");	
		else
			System.out.println("fail");	
	}
	public void content()
	{
		
	}
	
	

}
